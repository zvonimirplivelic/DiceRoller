package com.zvonimirplivelic.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            rollDice()
        }

        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRollOne = dice.roll()
        val diceRollTwo = dice.roll()

        val diceImageOne: ImageView = findViewById(R.id.ivDiceOne)
        val diceImageTwo: ImageView = findViewById(R.id.ivDiceTwo)


        val drawableResourceOne = when (diceRollOne) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResourceTwo = when (diceRollTwo) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageOne.setImageResource(drawableResourceOne)
        diceImageTwo.setImageResource(drawableResourceTwo)
        diceImageTwo.contentDescription = diceRollOne.toString()
        diceImageTwo.contentDescription = diceRollOne.toString()
    }
}