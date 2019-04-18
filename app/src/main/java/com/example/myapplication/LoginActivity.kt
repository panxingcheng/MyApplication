package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val viewName = super.findViewById<TextView>(R.id.name)
        val viewPassword = super.findViewById<TextView>(R.id.password)
        val viewLogin = super.findViewById<TextView>(R.id.login)

        viewLogin.setOnClickListener{

            val name = viewName.text.toString()
            val password = viewPassword.text.toString()

            if(name == "" || password == "") {

                Toast.makeText(this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show()
            } else if(name == "pxc" && password == "123") {

                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()


                val bundle = Bundle()
                bundle.putString(MainActivity.EXTRA_MESSAGE, "Hello, ${name}!")
                val intent = Intent(this, DisplayMessageActivity::class.java)
                intent.putExtras(bundle)
                super.startActivity(intent)

                super.finish()// 登录成功后销毁LoginActivity
            } else {

                Toast.makeText(this, "登录失败，用户名或密码错误", Toast.LENGTH_SHORT).show()
            }


        }


    }
}
