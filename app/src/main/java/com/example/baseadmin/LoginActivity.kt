package com.example.baseadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var auth: FirebaseAuth
        lateinit var editEmail: EditText
        lateinit var editPassword: EditText
        lateinit var btnLogin: Button
        lateinit var tvHeader : TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editEmail = findViewById(R.id.mEditemail)
        editPassword =findViewById(R.id.mEditpassword)
        btnLogin = findViewById(R.id.BtnLogin)
        tvHeader = findViewById(R.id.mTvHeader)

        auth = FirebaseAuth.getInstance()

        btnLogin.setOnClickListener {
            val email = editEmail.text.toString().trim()
            val password = editPassword.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()){
                auth.fetchSignInMethodsForEmail(email).addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        val result = task.result
                        if (result != null && result.signInMethods != null && result.signInMethods!!.contains(
                                EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD)){
                            auth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
                                if (it.isSuccessful){
                                    val intent = Intent(this,HomeActivity::class.java)
                                    startActivity(intent)
                                }else{
                                    Toast.makeText(this, it.exception.toString(), Toast.LENGTH_LONG).show()
                                }
                            }
                        }else{
                            Toast.makeText(this, "Email address is not registered.", Toast.LENGTH_LONG).show()
                        }
                    }else{
                        Toast.makeText(this, task.exception.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }else{
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_LONG).show()
            }
        }
    }
}