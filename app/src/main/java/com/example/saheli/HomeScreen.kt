package com.example.saheli

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.saheli.databinding.ActivityHomeScreenBinding
import com.jama.carouselview.CarouselView
import com.jama.carouselview.enums.IndicatorAnimationType

class HomeScreen : AppCompatActivity() {

    lateinit var binding: ActivityHomeScreenBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.requestButton.setOnClickListener { requestNapkinMethod() }

        if (binding.volunteerSwitch.isChecked) {
            binding.switchUse.text = "Switch is on"
//                val intent: Intent = Intent(this, HomeScreenForVolunteer::class.java)
//                startActivity(intent)
        }
//        else {
//            binding.switchUse.text = "Volunteer option is off"
//        } //TODO: have to implement more on watching the toggle button


    }

    fun requestNapkinMethod() { //TODO:
        val intent: Intent = Intent(this, RequestNapkin::class.java)
        startActivity(intent)
    }
}