package com.wahyuindra.calculatorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyuindra.calculatorexample.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}