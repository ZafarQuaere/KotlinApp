package com.example.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()



    }

    private fun initUI() {
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val textFogotPswd = findViewById<TextView>(R.id.textFogotPswd)
        val textNewUser = findViewById<TextView>(R.id.textNewUser)

        val email = editEmail.text
        val pswd = editPassword.text
        btnLogin.setOnClickListener {
            startActivity(Intent(this,EditTextActivity::class.java))
        }
    }
}
