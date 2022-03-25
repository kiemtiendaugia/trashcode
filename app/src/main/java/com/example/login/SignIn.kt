package com.example.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin.*

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        back_login.setOnClickListener {
            val intent1: Intent =
                Intent(this@SignIn, com.example.login.WelCome::class.java)
            startActivity(intent1)
        }

        val buttonlogin = findViewById<Button>(R.id.buttonlogin)
        lateinit var user: String
        lateinit var pass: String
        buttonlogin.setOnClickListener {
            user = username.text.toString()
            pass = password.text.toString()
            if (user == "ronaldo@gmail.com" && pass == "123456") {
                val intent: Intent =
                    Intent(this@SignIn, com.example.login.profile::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(this,"Incorrect E-mail or Password!!!",Toast.LENGTH_LONG).show()
            }

        }
    }
}