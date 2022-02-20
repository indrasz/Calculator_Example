package com.wahyuindra.calculatorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.wahyuindra.calculatorexample.databinding.ActivityMainBinding
import java.text.DecimalFormat
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edtOne = binding.edtOne.text.toString().trim()
        val edtTwo = binding.edtTwo.text.toString().trim()

        binding.btnHitung.setOnClickListener{

            var hasil = 0.0
            val dec = DecimalFormat ("#,###.##")

            when{
                TextUtils.isEmpty(edtOne) -> {
                    Toast.makeText(this, "Masukan Angka", Toast.LENGTH_SHORT).show()
                    binding.edtOne.requestFocus()
                }
                TextUtils.isEmpty(edtTwo) -> {
                    Toast.makeText(this, "Masukan Angka", Toast.LENGTH_SHORT).show()
                    binding.edtTwo.requestFocus()
                }
                else -> {
                    hasil = edtOne.toDouble() / edtTwo.toDouble()
                    binding.tvResult.text = dec.format(hasil).toString()
                }
            }
        }
    }
}