package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn: Button = findViewById(R.id.button)
        val output: TextView = findViewById(R.id.output)
        val input: EditText = findViewById(R.id.rupees)
        val dollar: TextView = findViewById(R.id.DOLLAR)
        val inr: TextView = findViewById(R.id.INR)
        val title: TextView = findViewById(R.id.Title)
        btn.setOnClickListener {
            val amount = input.text.toString().toDouble()
            output.text = (amount / 83.5680).toString()
        }
    }
}