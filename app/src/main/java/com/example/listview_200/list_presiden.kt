package com.example.listview_200

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class list_presiden (private val list_presiden: ArrayList<presiden>) : RecyclerView.Adapter<list_presiden.presidenViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): presidenViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_presiden, parent, false)
        return presidenViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list_presiden.size
    }

    override fun onBindViewHolder(holder: presidenViewHolder, position: Int) {
        val presiden = list_presiden[position]
        holder.tvName.text = presiden.name
        holder.tvTgl_lahir.text = presiden.tgl_lahir
        holder.tvDurasi.text = presiden.durasi
        Glide.with(holder.itemView.context)
            .load(presiden.poster)
            .into(holder.imgPoster)

        holder.itemView.setOnClickListener{
            Toast.makeText(
                holder.itemView.context, "Kamu memilih "+list_presiden[holder.adapterPosition].name,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    inner class presidenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tx_item_name)
        var tvTgl_lahir: TextView = itemView.findViewById(R.id.tx_item_tgl_lahir)
        var tvDurasi: TextView = itemView.findViewById(R.id.tx_item_durasi)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_presiden)
    }
}