package com.example.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstPageActivity : AppCompatActivity() {
    lateinit var btnBack1: Button
    lateinit var btnNext2 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        btnBack1 = findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent=Intent(this,SecondPageActivity::class.java)
            startActivity(intent)
        }
    }
}