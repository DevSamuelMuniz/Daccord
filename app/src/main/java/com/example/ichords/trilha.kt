package com.example.ichords

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class trilha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trilha)

        val backButton = findViewById<View>(R.id.back)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}
