package com.example.saheli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.saheli.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityLoginBinding
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginbutton.setOnClickListener { loginMethod() }

        binding.signUpHereButton.setOnClickListener { signUpHereMethod() }
    }

    fun loginMethod() {
       //TODO:Implement
        // to navigate to another user details screen
        val intent : Intent = Intent(this, UserDetails::class.java)
        startActivity(intent)
    }

    fun signUpHereMethod() {
        //TODO: implement this method
         // to navigate back to sign up screen
        val intent : Intent = Intent(this, SignUp::class.java)
        startActivity(intent)
    }
}