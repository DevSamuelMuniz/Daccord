package com.example.popup1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val rootLayout = findViewById<ConstraintLayout>(R.id.rootLayout)
    rootLayout.setOnClickListener {
        val intent = Intent(this@CurrentActivity, NextActivity::class.java)
        startActivity(intent)
    }

}

