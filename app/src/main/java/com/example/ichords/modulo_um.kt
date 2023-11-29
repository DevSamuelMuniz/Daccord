package com.example.ichords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.constraintlayout.widget.ConstraintSet.Layout

class modulo_um : AppCompatActivity() {
    private lateinit var voltar: ImageButton
    private lateinit var includedLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo_um)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })

        voltar = findViewById(R.id.voltarBtn)

        includedLayout = findViewById(R.id.clModulo1)
        includedLayout.setOnClickListener {
            Toast.makeText(this, "MainActivity", Toast.LENGTH_SHORT).show()

        }

        voltar.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
//    override fun onBackPressed() {
//        super.onBackPressed()
//        overridePendingTransition(0, 0)
//    }
}
