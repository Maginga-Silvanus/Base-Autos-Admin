package com.example.baseadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvTitle : TextView
    lateinit var tvinfo : TextView
    lateinit var BtnContinue : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle = findViewById(R.id.mTvTitle)
        tvinfo = findViewById(R.id.mTvInfo)
        BtnContinue = findViewById(R.id.mBtnContinue)

        BtnContinue.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}