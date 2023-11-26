package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class popup2 : AppCompatActivity() {
    private lateinit var imageButton2: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_2)

        imageButton2 = findViewById(R.id.imageButton2)

        imageButton2.setOnClickListener {
            val intent = Intent(this, popup3::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }


}
