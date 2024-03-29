package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class Splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // A Handler allows we to send and process Message and handles Activity
        Handler().postDelayed({
            val intent = Intent(this, Start_Activity::class.java)
            startActivity(intent)
            finish() },3000)
    }
}



