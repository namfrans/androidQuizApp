package com.example.lab4

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity: AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {

        super.onCreate( savedInstanceState )
        setContentView( R.layout.total_score_layout )

        val totalGrade: TextView = findViewById( R.id.scoreView )
        val complement: TextView = findViewById( R.id.message )
        val shareButton: Button = findViewById( R.id.shareBtn )
        val score = intent.getIntExtra( MainActivity.SCORE, 0 )

        totalGrade.text = score.toString()

        if ( score >= 8 ){
            complement.text = getString( R.string.excellent_complement )
        }
        if ( score in 5..7 ){
            complement.text = getString( R.string.good_complement )
        }
        if ( score < 5 ){
            complement.text = getString( R.string.satisfactory_complement )
        }

        shareButton.setOnClickListener{

            val sendIntent = Intent().apply {

                action = Intent.ACTION_SEND
                putExtra( Intent.EXTRA_TEXT, "You scored: $score  /10" )
                type = "text/plain"

            }
            try {
                startActivity( sendIntent )
            } catch ( e: ActivityNotFoundException ) {
                stopService( sendIntent )
            }
        }

    }
}