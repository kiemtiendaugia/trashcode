package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.dialog_fullname.*

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        dialogFullname()
        dialogEmail()
        dialogPhone()
    }
    private fun dialogFullname(){
        tv_fullname.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater=layoutInflater
            val dialogLayout=inflater.inflate(R.layout.dialog_fullname,null)
            val fn : EditText = dialogLayout.findViewById(R.id.dialog_name)
            with(builder){
                setTitle("Enter your name")
                setPositiveButton("Ok"){
                    dialog,which -> fullname.text = fn.text.toString()
                }
                setNegativeButton("Cancel"){_,_ ->
                }
                setView(dialogLayout)
                builder.show()
            }
        }
    }
    private fun dialogEmail(){
        tv_email.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater=layoutInflater
            val dialogLayout=inflater.inflate(R.layout.dialog_email,null)
            val e : EditText = dialogLayout.findViewById(R.id.dialog_mail)
            with(builder){
                setTitle("Enter your email")
                setPositiveButton("Ok"){
                        dialog,which -> email.text = e.text.toString()
                }
                setNegativeButton("Cancel"){_,_ ->
                }
                setView(dialogLayout)
                builder.show()
            }
        }

    }
    private fun dialogPhone(){
        tv_phone.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater=layoutInflater
            val dialogLayout=inflater.inflate(R.layout.dialog_phone,null)
            val p : EditText = dialogLayout.findViewById(R.id.dialogphone)
            with(builder){
                setTitle("Enter your phone")
                setPositiveButton("Ok"){
                        dialog,which -> phone.text = p.text.toString()
                }
                setNegativeButton("Cancel"){_,_ ->
                }
                setView(dialogLayout)
                builder.show()
            }
        }
    }
}