package com.example.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.databinding.ActivityMainBinding
import com.example.login.databinding.ActivitySigninBinding
import com.example.login.MainViewModel
import com.example.login.databinding.RecycleViewRestaurantBinding

class ListRes : AppCompatActivity() {
    private lateinit var binding: RecycleViewRestaurantBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.recycle_view_restaurant)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val data = DataRestaurant.getRes()
        val lm = LinearLayoutManager(this)
        val adapter = RestaurantAdapter(data)
        binding.restaurant.layoutManager=lm
        binding.restaurant.adapter=adapter

    }
}