package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn_click_me = findViewById(R.id.btn_send2) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

        }
    }
}