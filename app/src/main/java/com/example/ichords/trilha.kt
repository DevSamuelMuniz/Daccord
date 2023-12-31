package com.example.ichords

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.appcompat.app.AppCompatActivity
import com.example.ichords.modelSubmode.itemSubmode
import com.example.scrollviewtets.conteudo

class trilha : AppCompatActivity() {
    private lateinit var modulo1: ImageView
    private lateinit var voltar: ImageButton
    private lateinit var listaConteudo: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trilha)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val intent = Intent(this@trilha, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
        })

        modulo1 = findViewById(R.id.modulo1)

        modulo1.setOnClickListener {
            val intent = Intent(this, SubMode::class.java)
            startActivity(intent)
        }

        listaConteudo = findViewById(R.id.listaConteudo)

        listaConteudo.setOnClickListener{
            val intent = Intent(this, conteudo::class.java)
            startActivity(intent)
        }

        voltar = findViewById(R.id.voltarBtn)

        voltar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}
