package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    companion object {
        const val PREFERENCES_NAME = "ashe728y9e2h387"
        const val EMAIL_KEY = "98ueg7879h18e"
        const val EMAIL_KEY_EXTRA = "98392h37h923e-1093ie"
    }

    private lateinit var imageButton: ImageButton
    private var isFirstClick = true

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton = findViewById(R.id.botaoTrilha)

        imageButton.setOnClickListener {
            if (isFirstClick) {
                val intent = Intent(this, popup1::class.java)
                startActivity(intent)
                overridePendingTransition(0,0)
                isFirstClick = false
            } else {
                val intent = Intent(this, trilha::class.java)
                startActivity(intent)
                overridePendingTransition(0,0)
            }
        }
    }
}
