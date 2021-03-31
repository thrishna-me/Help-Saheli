package com.example.saheli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.saheli.databinding.ActivityVolunteerInfoBinding

class VolunteerInfo : AppCompatActivity() {
    lateinit var binding: ActivityVolunteerInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVolunteerInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ArrayAdapter.createFromResource(
            this,
            R.array.count_of_napkins,
            android.R.layout.simple_list_item_1
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.volunteerNapkinCount.adapter = arrayAdapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.size_of_napkin,
            android.R.layout.simple_list_item_1
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.volunteerNapkinSize.adapter = arrayAdapter
        }
    }
}