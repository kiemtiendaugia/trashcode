package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OnboardingTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        val next = findViewById<ImageView>(R.id.two9)
        next.setOnClickListener {
            val intent: Intent = Intent(this@OnboardingTwo, OnboardingThree::class.java)
            startActivity(intent)
        }
    }
}