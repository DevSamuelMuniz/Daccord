package com.example.ichords.AdapterSubmode

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ichords.R
import com.example.ichords.modelSubmode.itemSubmode
import android.content.res.ColorStateList
import com.example.ichords.Aula1Modulo1
import com.example.ichords.Aula2Modulo1
import com.example.ichords.Aula3Modulo1
import com.example.ichords.Aula4Modulo1
import com.example.ichords.Aula5Modulo1


class AdapterSubmode(private val context: Context, private val submodes: MutableList<itemSubmode>): RecyclerView.Adapter<AdapterSubmode.SubModeViewHolder>(){



    inner class SubModeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titulosubmode = itemView.findViewById<TextView>(R.id.tituloModulo1)
        var status = itemView.findViewById<TextView>(R.id.progressoModulo1)

        init {
            itemView.setOnClickListener {
                when (adapterPosition) {
                    0 -> context.startActivity(Intent(context, Aula1Modulo1::class.java))
                    1 -> context.startActivity(Intent(context, Aula2Modulo1::class.java))
                    2 -> context.startActivity(Intent(context, Aula3Modulo1::class.java))
                    3 -> context.startActivity(Intent(context, Aula4Modulo1::class.java))
                    4 -> context.startActivity(Intent(context, Aula5Modulo1::class.java))
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubModeViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        val holder = SubModeViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int = submodes.size

    override fun onBindViewHolder(holder: SubModeViewHolder, position: Int) {
        holder.titulosubmode.text = submodes[position].tituloSubmode

        if (position % 2 == 0) {
            // If the position is even, set the backgroundTint to light blue
            holder.itemView.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#3F96FD"))
        } else {
            // If the position is odd, set the backgroundTint to blue
            holder.itemView.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#1E64E8"))
        }
    }
}