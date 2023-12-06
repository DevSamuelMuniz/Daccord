package com.example.ichords

import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatRadioButton

class PerguntaAula3Modulo1 : AppCompatActivity() {

    private val questions = listOf(
        "Qual é a finalidade da numeragem de 1 a 6 em relação às cordas do violão?  ",
        "Como as cordas de aço e de nylon diferem em termos de som? ",
        "Por que a manutenção e a troca regular das cordas são consideradas importantes para a qualidade sonora do violão?"
    )

    private val options = listOf(
        listOf("Para identificar as cravelhas de ajuste ", "Para marcar os trastes", "Para classificar os diferentes tipos de madeira ", "Para identificar a ordem das cordas, da mais aguda para a mais grave"),
        listOf("Aço: Som mais suaves;  Nylon: Som mais brilhante. ", "Nylon: Som mais pop; Aço: Som mais clássico. ", "Aço: Som mais brilhante e pop; Nylon: Som mais clássico. ", "Não há diferença sonora entre as cordas de aço e nylon."),
        listOf("Para aumentar o volume do instrumento ", "Para modificar o timbre do violão ", "Para preservar a afinação e a qualidade sonora do instrumento ao longo do tempo ", "Para diminuir a tensão das cordas.")
    )

    private lateinit var questionTextView: TextView
    private lateinit var answerRadioGroup: RadioGroup
    private lateinit var nextButton: Button
    private lateinit var button1: RadioButton
    private lateinit var button2: RadioButton
    private lateinit var button3: RadioButton
    private lateinit var button4: RadioButton

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        button1 = findViewById(R.id.answer1RadioButton)
        button2 = findViewById(R.id.answer2RadioButton)
        button3 = findViewById(R.id.answer3RadioButton)
        button4 = findViewById(R.id.answer4RadioButton)

        questionTextView = findViewById(R.id.questionTextView)
        answerRadioGroup = findViewById(R.id.answerRadioGroup)
        nextButton = findViewById(R.id.nextButton)
        nextButton.isEnabled = false

        updateQuestion()

        nextButton.setOnClickListener {
            if (currentQuestionIndex < questions.size -1) {
                currentQuestionIndex++
                updateQuestion()

            } else {
                val intent = Intent(this, Aula4Modulo1::class.java)
                startActivity(intent)
            }
        }

        answerRadioGroup.setOnCheckedChangeListener { _, _ ->
            nextButton.isEnabled = true
        }
    }

    private fun updateQuestion() {
        if (questions.isNotEmpty() && currentQuestionIndex < questions.size) {
            questionTextView.text = questions[currentQuestionIndex]

            val optionsForCurrentQuestion = options[currentQuestionIndex]
            button1.text = optionsForCurrentQuestion[0]
            button2.text = optionsForCurrentQuestion[1]
            button3.text = optionsForCurrentQuestion[2]
            button4.text = optionsForCurrentQuestion[3]

            answerRadioGroup.clearCheck()

            nextButton.isEnabled = false
        }
    }
}
