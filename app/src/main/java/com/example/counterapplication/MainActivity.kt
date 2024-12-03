package com.example.counterapplication

import com.example.counterapplication.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        binding.incrementButton.setOnClickListener {
            incrementCounter()
        }

        binding.resetButton.setOnClickListener {
            resetCounter()
        }
    }

    private fun incrementCounter() {
        counter++
        updateCounterText()
    }

    private fun resetCounter() {
        counter = 0
        updateCounterText()
    }

    private fun updateCounterText() {
        binding.counterText.text = counter.toString()
    }
}
