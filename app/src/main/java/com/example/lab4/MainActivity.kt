package com.example.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val SCORE = "score"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val quizQuestion: TextView = findViewById(R.id.quiz_que)
        val radioTrue: RadioButton = findViewById(R.id.radioButtonTrue)
        val radioFalse: RadioButton = findViewById(R.id.radioButtonFalse)
        val computeResults: Button = findViewById(R.id.button)
        val queProgress: ProgressBar = findViewById(R.id.progressBar)
        val nxtButtom: Button = findViewById(R.id.nxt)
        var marks = 0
        var i = 0
        var inc = 0
        var clicked = false

        val questions= listOf("Windhoek is the capital city of Namibia","Namibia got Independent in 1991", "Telecom is the first telecomunication company established in Namibia", "Andimba Toivo Ya Toivo is the first persident of Nambia", "Cassinga is in Angola", "Hereos day celebrated in 26 August", "Namibia has the best roads in Africa", "There are no Black Rinhos in Namibia", "Tswana people are from Namibia", "There's a sea beach in Ruacanna")


        computeResults.setOnClickListener{
            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra(SCORE, marks)
            startActivity(intent)
        }
        quizQuestion.setText(questions[0])
            nxtButtom.setOnClickListener{
                if(i < 9){
                    i++
                    queProgress.setProgress(i)
                    quizQuestion.setText(questions[i])
                    radioFalse.isChecked = false;
                    radioTrue.isChecked = false;
                    clicked = true
                }else{
                    val doneMessage = Toast.makeText(this, "You have answered all questions, click 'Compute Grade' to view your score.", Toast.LENGTH_LONG)
                    doneMessage.show()
                }
            }
        if(queProgress.isAnimating){
            inc++
        }
        fun Correct(){
            if (radioTrue.isChecked == false){
                radioTrue.setOnClickListener{
                    val toastCorrect = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                    marks++
                    toastCorrect.show()
                }
            }
            if (radioFalse.isChecked == false){
                radioFalse.setOnClickListener{
                    val toastFalse = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                    toastFalse.show()
                    radioFalse.clearFocus()
                }
            }
        }
        fun Wrong(){
            if (radioTrue.isChecked === false){
                radioTrue.setOnClickListener{
                    val toastCorrect1 = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT)
                    toastCorrect1.show()
                }
            }
            if (radioFalse.isChecked === false){
                radioFalse.setOnClickListener{
                    val toastFalse1 = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT)
                    marks++
                    toastFalse1.show()
                }
            }
        }
        if (quizQuestion.text == questions[0]) {
            Correct()
        }else if (quizQuestion.text == questions[1]) {
            Wrong()
        }else if(quizQuestion.text == questions[2]) {
            Wrong()
        }else if (quizQuestion.text == questions[3]) {
            Wrong()
        }else if (quizQuestion.text == questions[4]) {
            Correct()
        }else if(quizQuestion.text == questions[5]) {
            Correct()
        }else if (quizQuestion.text == questions[6]) {
            Correct()
        }else if (quizQuestion.text == questions[7]) {
            Correct()
        }else if (quizQuestion.text == questions[8]) {
            Wrong()
        }else{
            Wrong()
        }
    }
}