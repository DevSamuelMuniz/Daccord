package com.example.ichords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintSet.Layout

class modulo_um : AppCompatActivity() {
    private lateinit var voltar: ImageButton
    private lateinit var includedLayout: Layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo_um)

        voltar = findViewById(R.id.boltarBtn)


        val includedLayout = findViewById<View>(R.id.ctnModulo)
        includedLayout.setOnClickListener {

        }

        voltar.setOnClickListener {
            val intent = Intent(this, trilha::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }
}
