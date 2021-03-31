package com.example.saheli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.saheli.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {
    lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emergencyContacts.setOnClickListener { Toast.makeText(this, "You haven't add any contacts", Toast.LENGTH_SHORT).show() }

        binding.profileSettings.setOnClickListener { Toast.makeText(this, "You can aceess this settings very soon", Toast.LENGTH_SHORT).show() }
    }
}