package com.example.ichords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EstiloMusical : AppCompatActivity() {

    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estilo_musical)

        finishButton =  findViewById(R.id.finishButton)

        finishButton.setOnClickListener {
            val intent = Intent(this, ResultadoTeste::class.java)
            startActivity(intent)
        }

    }


}