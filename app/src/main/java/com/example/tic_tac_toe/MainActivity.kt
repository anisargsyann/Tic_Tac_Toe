package com.example.tic_tac_toe

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.button)
        val score1 = findViewById<TextView>(R.id.score1)
        val score2 = findViewById<TextView>(R.id.score2)

        start.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 0)
        }
        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            if (resultCode == Activity.RESULT_OK && requestCode == 1) {
                score1.text = data?.getStringExtra("player1Score")
                score2.text = data?.getStringExtra("player2Score")
            } else if (resultCode == Activity.RESULT_CANCELED && requestCode == 1) {
                score1.text = data?.getStringExtra("player1Score")
                score2.text = data?.getStringExtra("player2Score")
            }
        }
    }
}