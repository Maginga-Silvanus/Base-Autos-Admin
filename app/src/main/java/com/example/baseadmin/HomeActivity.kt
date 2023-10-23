package com.example.baseadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvWelcome : TextView
    lateinit var btnBrands : Button
    lateinit var btnVehicle : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        tvWelcome = findViewById(R.id.mTvWelcome)
        btnBrands = findViewById(R.id.mBtnbrand)
        btnVehicle = findViewById(R.id.mBtnVehicle)

        btnBrands.setOnClickListener {
            val intent = Intent(this, BrandsActivity::class.java)
            startActivity(intent)
        }

        btnVehicle.setOnClickListener {
            val intent = Intent(this, ModelActivity::class.java)
            startActivity(intent)
        }
    }
}