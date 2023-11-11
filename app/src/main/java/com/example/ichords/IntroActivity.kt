package com.example.ichords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
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

    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        questionTextView = findViewById(R.id.questionTextView)
        answerRadioGroup = findViewById(R.id.answerRadioGroup)
        nextButton = findViewById(R.id.nextButton)
        nextButton.isEnabled = false // Disable the button initially

        updateQuestion()

        nextButton.setOnClickListener {
            currentQuestionIndex++

            if (currentQuestionIndex >= questions.size) {
                return@setOnClickListener
            }

            updateQuestion()
        }

        answerRadioGroup.setOnCheckedChangeListener { _, _ ->
            nextButton.isEnabled = true // Enable the button when a radio button is selected
        }
    }

    private fun updateQuestion() {
        questionTextView.text = questions[currentQuestionIndex]

        answerRadioGroup.removeAllViews()

        for (option in options[currentQuestionIndex]) {
            val radioButton = AppCompatRadioButton(this)
            radioButton.text = option
            radioButton.layoutParams = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.MATCH_PARENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            answerRadioGroup.addView(radioButton)
        }

        nextButton.isEnabled = false // Disable the button after updating the question
    }
}
