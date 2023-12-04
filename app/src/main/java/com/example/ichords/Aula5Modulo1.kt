package com.example.ichords

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Aula5Modulo1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aula5_modulo1)

        val videoView = findViewById<VideoView>(R.id.video_aula5modulo1)
        val packageName = "android.resource://" + getPackageName() + "/" + R.raw.aulacinco

        val uri = Uri.parse(packageName)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
    }
}