package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity(){

    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main )

        resultText = findViewById( R.id.tv_result )

        val rollButton: Button = findViewById( R.id.btn_roll )

        val countUpButton: Button = findViewById( R.id.btn_count_up)

        rollButton.setOnClickListener{ rollDice() }

        countUpButton.setOnClickListener {
            countUp()
        }

    }

    private fun countUp() {

        resultText.apply {
            when(this.text){
                "Hello World" -> this.text = "1"
                "6" -> this.text = "6"
                else -> this.text = ( this.text.toString().toInt() + 1 ).toString()
            }
        }

    }

    private fun rollDice(){

        resultText.text = (1..20).random().toString()
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show();
    }
}