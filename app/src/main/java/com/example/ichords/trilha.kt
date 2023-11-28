package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class trilha : AppCompatActivity() {
    private lateinit var modulo1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trilha)

        modulo1 = findViewById(R.id.modulo1)

        modulo1.setOnClickListener {
            val intent = Intent(this, modulo_um::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }

}
