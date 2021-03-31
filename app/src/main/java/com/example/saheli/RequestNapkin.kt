package com.example.saheli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.saheli.databinding.ActivityRequestNapkinBinding

class RequestNapkin : AppCompatActivity() {
    lateinit var binding: ActivityRequestNapkinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRequestNapkinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countOfNapkins = resources.getStringArray(R.array.count_of_napkins)

        if (binding.napkinCount != null) {
            ArrayAdapter.createFromResource(
                this,
                R.array.count_of_napkins,
                android.R.layout.simple_list_item_1
            ).also { arrayAdapter ->
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                binding.napkinCount.adapter = arrayAdapter
            }
        }

        if (binding.napkinSize != null) {
            ArrayAdapter.createFromResource(
                this,
                R.array.size_of_napkin,
                android.R.layout.simple_list_item_1
            ).also { arrayAdapter ->
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                binding.napkinSize.adapter = arrayAdapter
            }
        }

        binding.requestNapkinButton.setOnClickListener { requestNapkinAlertMethod() }
    }

    fun requestNapkinAlertMethod() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Sent Request to Volunteer")
        builder.setMessage("Your request for napkin has sent to the volunteer, we request you to wait till the volunteer get back")
        builder.setIcon(R.drawable.ic_baseline_emoji_people_24)
        builder.setPositiveButton("OK"){dialog, which -> Toast.makeText(this, "Clicked Ok", Toast.LENGTH_SHORT).show() }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}