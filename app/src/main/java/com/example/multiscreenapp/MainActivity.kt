package com.example.multiscreenapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val KEY = "com.example.multiscreenapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val orderList =
                "${binding.eT1.text}\n${binding.eT2.text}\n${binding.eT3.text}\n${binding.eT4.text}"

            val intent = Intent(this, Orders::class.java)
            intent.putExtra(KEY, orderList)
            startActivity(intent)
        }
    }
}