package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.signup
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_verifycode.*

class verifycode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifycode)
        back.setOnClickListener {
            val intent: Intent = Intent(this@verifycode,com.example.login.MainActivity::class.java)
            startActivity(intent)
        }

    }
}