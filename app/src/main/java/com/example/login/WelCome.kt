package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class WelCome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val signup = findViewById<ImageView>(R.id.imagephone)
        signup.setOnClickListener {
            val intent: Intent= Intent(this@WelCome,com.example.login.signup::class.java)
            startActivity(intent)
        }

        val signin = findViewById<TextView>(R.id.textsignin)
        signin.setOnClickListener {
            val intent: Intent= Intent(this@WelCome, SignIn::class.java)
            startActivity(intent)
        }


    }
}