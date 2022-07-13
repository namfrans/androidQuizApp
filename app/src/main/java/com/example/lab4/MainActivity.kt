package com.example.lab4

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    companion object {
        const val SCORE = "score"
    }
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.main_activity )

        val questionSector: TextView = findViewById( R.id.question )
        val radioButtonTrue: RadioButton = findViewById( R.id.radioButtonTrue )
        val radioButtonFalse: RadioButton = findViewById( R.id.radioButtonFalse )
        val computeResults: Button = findViewById( R.id.computeGrade )
        val progressBar: ProgressBar = findViewById( R.id.progressBar )
        val nextButton: Button = findViewById( R.id.next )

        var marks = 0
        var questionNumber = 0

        val questions= listOf(
            "Windhoek is the capital city of Namibia",
            "Namibia got Independent in 1991",
            "Telecom is the first telecommunication company established in Namibia",
            "Andimba Toivo Ya Toivo is the first president of Namibia",
            "Cassinga is in Angola",
            "Heroes day celebrated in 26 August",
            "Namibia has the best roads in Africa",
            "There are no Black Rhinos in Namibia",
            "Tswana people are from Namibia",
            "There's a sea beach in Ruacana"
        )

        fun correct() {
            radioButtonTrue.setOnClickListener {
                val toastCorrect = Toast.makeText( this, "Correct", Toast.LENGTH_SHORT )
                marks++
                toastCorrect.show()
                radioButtonFalse.isEnabled = false
            }

            radioButtonFalse.setOnClickListener {
                val toastIncorrect = Toast.makeText( this, "Incorrect", Toast.LENGTH_SHORT )
                toastIncorrect.show()
                radioButtonTrue.isEnabled = false
            }
        }

        fun wrong() {
            radioButtonTrue.setOnClickListener {
                val toastIncorrect = Toast.makeText( this, "Incorrect", Toast.LENGTH_SHORT )
                toastIncorrect.show()
                radioButtonFalse.isEnabled = false
            }

            radioButtonFalse.setOnClickListener {
                val toastCorrect = Toast.makeText( this, "Correct", Toast.LENGTH_SHORT )
                marks++
                toastCorrect.show()
                radioButtonTrue.isEnabled = false
            }
        }

        //Set first question on launch
        questionSector.text = questions[ questionNumber ]

        if ( questionSector.text == questions[0] ) {
            correct()
        }

        nextButton.setOnClickListener {
            if ( questionNumber < 9 ) {
                questionNumber += 1
                progressBar.progress = questionNumber
                questionSector.text = questions[ questionNumber ]

                when ( questionSector.text ) {
                    questions[1] -> wrong()
                    questions[2] -> wrong()
                    questions[3] -> wrong()
                    questions[4] -> correct()
                    questions[5] -> correct()
                    questions[6] -> correct()
                    questions[7] -> correct()
                    questions[8] -> wrong()
                    questions[9] -> wrong()
                }

                radioButtonTrue.isChecked = false
                radioButtonTrue.isEnabled = true

                radioButtonFalse.isChecked = false
                radioButtonFalse.isEnabled = true
            } else {
                val doneMessage = Toast.makeText( this, "You have answered all questions, click 'Compute Grade' to view your score.", Toast.LENGTH_LONG )
                doneMessage.show()
            }
        }

        computeResults.setOnClickListener {
            val intent = Intent( this, ScoreActivity::class.java )
            intent.putExtra( SCORE, marks )
            startActivity( intent )
        }
    }
}