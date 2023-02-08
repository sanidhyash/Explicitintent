package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIntent= findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener{
            //open a new activity and new screen for a user
            intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}