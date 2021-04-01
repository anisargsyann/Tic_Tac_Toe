package com.example.tic_tac_toe

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Thread.sleep

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val box11 = findViewById<Button>(R.id.box11)
        val box12 = findViewById<Button>(R.id.box12)
        val box13 = findViewById<Button>(R.id.box13)
        val box21 = findViewById<Button>(R.id.box21)
        val box22 = findViewById<Button>(R.id.box22)
        val box23 = findViewById<Button>(R.id.box23)
        val box31 = findViewById<Button>(R.id.box31)
        val box32 = findViewById<Button>(R.id.box32)
        val box33 = findViewById<Button>(R.id.box33)
        val winner = findViewById<TextView>(R.id.winner)

        var player1 = true
        var player2 = false
        var walkCount = 9
        var player1Score = 0
        var player2Score = 0
        while (walkCount >= 0) {
            box11.setOnClickListener {
                if (box11.text == "") {
                    if (player1) {
                        box11.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box11.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }

            box12.setOnClickListener {
                if (box12.text == "") {
                    if (player1) {
                        box12.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box12.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box13.setOnClickListener {
                if (box13.text == "") {
                    if (player1) {
                        box13.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box13.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box21.setOnClickListener {
                if (box21.text == "") {
                    if (player1) {
                        box21.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box21.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box22.setOnClickListener {
                if (box22.text == "") {
                    if (player1) {
                        box22.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box22.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box23.setOnClickListener {
                if (box23.text == "") {
                    if (player1) {
                        box23.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box23.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box31.setOnClickListener {
                if (box31.text == "") {
                    if (player1) {
                        box31.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box31.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box32.setOnClickListener {
                if (box32.text == "") {
                    if (player1) {
                        box32.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box32.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }
            box33.setOnClickListener {
                if (box33.text == "") {
                    if (player1) {
                        box33.text = "X"
                        player1 = false
                        player2 = true
                    } else {
                        box33.text = "O"
                        player1 = true
                        player2 = false
                    }
                    walkCount--
                }
            }

            if ((box11.text == "X" && box22.text == "X" && box33.text == "X") ||
                    (box11.text == "X" && box12.text == "X" && box13.text == "X") ||
                    (box21.text == "X" && box22.text == "X" && box23.text == "X") ||
                    (box31.text == "X" && box32.text == "X" && box33.text == "X") ||
                    (box13.text == "X" && box22.text == "X" && box31.text == "X")) {
                player1Score++
                winner.text = "The winner is Player1!"
                sleep(3000)
                val intent = Intent()
                intent.putExtra("player1Score", player1Score.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            } else if ((box11.text == "O" && box22.text == "O" && box33.text == "O") ||
                    (box11.text == "O" && box12.text == "O" && box13.text == "O") ||
                    (box21.text == "O" && box22.text == "O" && box23.text == "O") ||
                    (box31.text == "O" && box32.text == "O" && box33.text == "O") ||
                    (box13.text == "O" && box22.text == "O" && box31.text == "O")) {
                player2Score++
                winner.text = "The winner is Player2!"
                sleep(3000)
                val intent = Intent()
                intent.putExtra("player2Score", player2Score.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            } else if (walkCount == 0) {
                winner.text = "The game ended in draw"
                val intent = Intent()
                setResult(Activity.RESULT_CANCELED, intent)
                finish()
            }
        }
    }
}