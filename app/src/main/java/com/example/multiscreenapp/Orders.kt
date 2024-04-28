package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiscreenapp.databinding.ActivityOrdersBinding

class Orders : AppCompatActivity() {

    private lateinit var binding: ActivityOrdersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)
        binding.tvOrder.text = "Order placed:\n" + ordersOfCustomer.toString()
    }
}
