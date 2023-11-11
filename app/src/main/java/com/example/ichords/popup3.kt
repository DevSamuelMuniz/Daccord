package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class popup3 : AppCompatActivity() {
    private lateinit var imageButton3: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_3)

        imageButton3 = findViewById(R.id.imageButton3)

        imageButton3.setOnClickListener {
            val intent = Intent(this, popup4::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
        }
    }

}
