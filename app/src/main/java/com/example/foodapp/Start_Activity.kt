package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Start_Activity : AppCompatActivity() {

    lateinit var Btn: Button

    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        Btn = findViewById(R.id.nextButton)

        Btn.setOnClickListener {
            val implicit = Intent(this, LoginActivity::class.java)
            startActivity(implicit)
        }
    }
}