package com.example.baseadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ModelActivity : AppCompatActivity() {
    lateinit var EdtName : EditText
    lateinit var EdtPrice : EditText
    lateinit var EdtColor : EditText
    lateinit var EdtTransmission : EditText
    lateinit var BtnUpload : Button
    lateinit var BtnSave : Button
    lateinit var BtnView : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model)
        EdtName = findViewById(R.id.mEditName)
        EdtPrice = findViewById(R.id.mEdtPrice)
        EdtColor = findViewById(R.id.mEdtColor)
        EdtTransmission = findViewById(R.id.mEdtTransmission)
        BtnUpload = findViewById(R.id.mBtnUpload)
        BtnSave = findViewById(R.id.mBtnSave)
        BtnView = findViewById(R.id.mBtnView)
    }
}