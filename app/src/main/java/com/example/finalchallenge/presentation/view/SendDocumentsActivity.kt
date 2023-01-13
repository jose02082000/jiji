package com.example.finalchallenge.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalchallenge.databinding.ActivitySendDocumentsBinding

class SendDocumentsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendDocumentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendDocumentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}