package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OnboardingOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        val next = findViewById<ImageView>(R.id.image9)
        next.setOnClickListener {
            val intent: Intent = Intent(this@OnboardingOne, OnboardingTwo::class.java)
            startActivity(intent)
        }

    }
}