package com.example.ichords

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.OnBackPressedCallback

class Aula5Modulo1 : AppCompatActivity() {

    private lateinit var voltar: ImageButton
    private lateinit var proximo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aula5_modulo1)

        val videoView = findViewById<VideoView>(R.id.video_aula5modulo1)
        val packageName = "android.resource://" + getPackageName() + "/" + R.raw.aulacinco
        val uri = Uri.parse(packageName)
        videoView.setVideoURI(uri)
        videoView.start()


        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })

        voltar = findViewById(R.id.voltarBtn)

        voltar.setOnClickListener {
            finish()
        }

        proximo = findViewById(R.id.proximaAula1)

        proximo.setOnClickListener{
            val intent = Intent(this, PerguntaAula5Modulo1::class.java)
            startActivity(intent)
        }
    }
}