package com.example.saheli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import com.example.saheli.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivitySignUpBinding
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupbutton.setOnClickListener {
            signupMethod()
        }
        binding.loginHereButton.setOnClickListener { loginHereMethod() }
    }

    fun signupMethod(){
        val intent : Intent = Intent(this, UserDetails::class.java)
        startActivity(intent)
    }

    fun loginHereMethod() {
        val intent : Intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

}