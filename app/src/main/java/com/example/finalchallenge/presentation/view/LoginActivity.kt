package com.example.finalchallenge.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalchallenge.R
import com.example.finalchallenge.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}