package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.appcompat.app.AppCompatActivity

class trilha : AppCompatActivity() {
    private lateinit var modulo1: ImageView
    private lateinit var voltar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trilha)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })

        modulo1 = findViewById(R.id.modulo1)

        modulo1.setOnClickListener {
            val intent = Intent(this, modulo_um::class.java)
            startActivity(intent)
        }

        voltar = findViewById(R.id.voltarBtn)

        voltar.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }

    }
}
