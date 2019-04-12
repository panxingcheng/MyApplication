package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = super.getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE)

        val textView = super.findViewById<TextView>(R.id.textView)

        textView.text = message
    }
}
