package com.zvonimirplivelic.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
        }

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)

        val diceOne: TextView = findViewById(R.id.tvDiceOne)
        val diceTwo: TextView = findViewById(R.id.tvDiceTwo)

        diceOne.text = dice.roll().toString()
        diceTwo.text = dice.roll().toString()
    }
}