package com.example.ichords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView.AdapterContextMenuInfo
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ichords.AdapterSubmode.AdapterSubmode
import com.example.ichords.modelSubmode.itemSubmode

class SubMode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submode)

        val recyclerView_submode = findViewById<RecyclerView>(R.id.recyclerView_submode)
        recyclerView_submode.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView_submode.setHasFixedSize(true)

        val listaConteudo: MutableList<itemSubmode> = mutableListOf()
        val adapterSubmode = AdapterSubmode(this, listaConteudo)
        recyclerView_submode.adapter = adapterSubmode

        val conteudo1 = itemSubmode(
            "Conhecendo a anatomia\n" + "do violão",
            "Em andamento"
        )
        listaConteudo.add(conteudo1)

        val conteudo2 = itemSubmode(
            "Aprendendo a postura correta",
            "Bloqueado"
        )
        listaConteudo.add(conteudo2)

        val conteudo3 = itemSubmode(
            "Segurando o violão",
            "Bloqueado"
        )
        listaConteudo.add(conteudo3)

        val conteudo4 = itemSubmode(
            "Vamos praticar!",
            "Bloqueado"
        )
        listaConteudo.add(conteudo4)

    }
}