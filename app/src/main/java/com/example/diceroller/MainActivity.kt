package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
           rollDice()
        }


    }

    private fun rollDice() {

        //Dice Result
        val titleApp:TextView = findViewById(R.id.diceResult)
        val randomInt = java.util.Random().nextInt(6) + 1
        titleApp.text = randomInt.toString()

        //Dice Image
        val diceImage:ImageView = findViewById(R.id.diceImage)

        val resultDiceImage = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6 }


        diceImage.setImageResource(resultDiceImage)

    }
}



