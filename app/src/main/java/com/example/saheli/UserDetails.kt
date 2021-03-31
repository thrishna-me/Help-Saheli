package com.example.saheli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.saheli.databinding.ActivitySignUpBinding
import com.example.saheli.databinding.ActivityUserDetailsBinding

class UserDetails : AppCompatActivity() {
    lateinit var binding: ActivityUserDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: implement volunteer screen based on the radio button
        binding.submitbutton.setOnClickListener {
            homeScreenMethod()
        }

    }

    fun homeScreenMethod() {
        val intent: Intent = Intent(this, HomeScreen::class.java)
        startActivity(intent)
    }
}