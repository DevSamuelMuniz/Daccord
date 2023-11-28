package com.example.ichords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class modulo_um : AppCompatActivity() {
    private lateinit var voltar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo_um)

        voltar = findViewById(R.id.boltarBtn)

        voltar.setOnClickListener {
            val intent = Intent(this, trilha::class.java)
            startActivity(intent)
        }
    }
}