package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class popup4 : AppCompatActivity() {
    private lateinit var Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_4)

        Button = findViewById(R.id.testebotao)
        Button.setOnClickListener {
            val intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0,0)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }

}
