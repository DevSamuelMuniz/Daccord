package com.example.ichords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoTeste : AppCompatActivity() {

    private lateinit var btn_resultado: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_teste)

        btn_resultado = findViewById(R.id.btn_resultado)

        btn_resultado.setOnClickListener{
            val intent = Intent(this, trilha::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }

}