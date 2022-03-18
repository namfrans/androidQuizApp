package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //val quizNumber: TextView = findViewById(R.id.quiz_num)
        val quizQuestion: TextView = findViewById(R.id.quiz_que)
        val radioTrue: RadioButton = findViewById(R.id.radioButtonTrue)
        val radioFalse: RadioButton = findViewById(R.id.radioButtonFalse)
        //val computeResults: Button = findViewById(R.id.button)
        var marks = 0
        var i = 0
        val questions= listOf("Windhoek is the capital city of Namibia","Namibia got Independent in 1991", "Telecom is the first telecomunication company established in Namibia", "Andimba Toivo Ya Toivo is the first persident of Nambia", "Cassinga is in Angola", "Hereos day celebrated in 26 August", "Namibia has the best roads in Africa", "There are no Black Rinhos in Namibia", "Tswana people are from Namibia", "There's a sea beach in Ruacanna")

        var toastCorrect: Toast
        var toastFalse: Toast
        while (i < questions.size){
            when(i){
                0 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastFalse.show()
                        i += 1
                    }

                }
                1 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastFalse.show()
                        i += 1
                    }
                }
                2 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastFalse.show()
                        i += 1
                    }
                }
                3 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastFalse.show()
                        i += 1
                    }
                }
                4 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastFalse.show()
                        i += 1
                    }
                }
                5 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastFalse.show()
                        i += 1
                    }
                }
                6 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastFalse.show()
                        i += 1
                    }
                }
                7 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastFalse.show()
                        i += 1
                    }
                }
                8 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastFalse.show()
                        i += 1
                    }
                }
                9 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastFalse.show()
                        i += 1
                    }
                }
                10 -> {
                    quizQuestion.text = questions[i]
                    radioTrue.setOnClickListener{
                        toastCorrect = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                        toastCorrect.show()
                        i += 1
                    }
                    radioFalse.setOnClickListener{
                        toastFalse = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                        marks++
                        toastFalse.show()
                        i += 1
                    }

                }
            }
        }
    }
}