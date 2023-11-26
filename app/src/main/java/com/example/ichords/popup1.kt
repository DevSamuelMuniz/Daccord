package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class popup1 : AppCompatActivity() {
    private lateinit var imageButton1: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_1)

        imageButton1 = findViewById(R.id.imageButton1)

        imageButton1.setOnClickListener {
            val intent = Intent(this, popup2::class.java)
            startActivity(intent)

            overridePendingTransition(0,0)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }

}
