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

class IntroActivity : AppCompatActivity() {

    private val questions = listOf(
        "Você já toca ou tocou violão?",
        "Quais acordes você conhece ou já tocou?",
        "Qual é o seu nível de experiência em leitura de cifras ou tablaturas?",
        "Você tem algum conhecimento prévio sobre teoria musical?"
    )

    private val options = listOf(
        listOf("Sim, já toco violão", "Já toquei, mas desisti", "Não, mas acompanho", "Não, nunca toquei antes"),
        listOf("A, D, E", "Dm, Gb, B9, F#M", "Outros", "Nenhum"),
        listOf("Básico", "Intermediário", "Avançado", "Nenhum"),
        listOf("Sim, conheço bastante", "Sim, um pouco", "Não, mas já olhei", "Não possuo conhecimento")
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
                val intent = Intent(this, EstiloMusical::class.java)
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
