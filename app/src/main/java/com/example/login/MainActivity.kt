package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_splash.*

class MainActivity : AppCompatActivity() {
//    lateinit var user: String
//    lateinit var pass: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        signup.setOnClickListener {
//            val intent: Intent= Intent(this@MainActivity,com.example.login.signup::class.java)
//            startActivity(intent)
//        }
//
//        buttonlogin.setOnClickListener {
//            user = username.text.toString()
//            pass = password.text.toString()
//            if (user == "ronaldo@gmail.com" && pass == "123456") {
//                val intent: Intent =
//                    Intent(this@MainActivity, com.example.login.profile::class.java)
//                startActivity(intent)
//            } else{
//                Toast.makeText(this,"Incorrect E-mail or Password!!!",Toast.LENGTH_LONG).show()
//            }
//
//        }
        splash_hub.alpha=0f
        splash_hub.animate().setDuration(3000).alpha(1f).withEndAction {
            val intent : Intent = Intent(this@MainActivity, OnboardingOne::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }

    }



