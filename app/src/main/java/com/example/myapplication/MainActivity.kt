package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "com.example.myapplication"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {

        val intent = Intent(this, DisplayMessageActivity::class.java)

        val message = super.findViewById<EditText>(R.id.editText).text.toString()

        intent.putExtra(EXTRA_MESSAGE, message)

        super.startActivity(intent)
    }
}
