package com.example.lab4

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.total_score_layout)

        val gradeValue: TextView = findViewById(R.id.scoreView)
        val complement: TextView = findViewById(R.id.message)
        val shareButton: Button = findViewById(R.id.shareBtn)
        val num = intent.getIntExtra(MainActivity.SCORE, 0)

        gradeValue.setText(Integer.toString(num))
        if (num >= 8){
            complement.setText("Excellent,Frans you did well.")
        }
        if (num in 5..7){
            complement.setText("Good,Frans you passed.")
        }
        if (num < 5){
            complement.setText("Poor,Frans you failed.")
        }

        shareButton.setOnClickListener{
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,  "You scored: "+ num+ " /10")
                type = "text/plain"
            }
            try {
                startActivity(sendIntent)
            }catch (e: ActivityNotFoundException){
                stopService(sendIntent)
            }

        }
    }
}