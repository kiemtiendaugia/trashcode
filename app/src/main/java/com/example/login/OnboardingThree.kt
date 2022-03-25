package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OnboardingThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)

        val next = findViewById<ImageView>(R.id.three9)
        next.setOnClickListener {
            val intent: Intent = Intent(this@OnboardingThree, WelCome::class.java)
            startActivity(intent)
        }
    }
}