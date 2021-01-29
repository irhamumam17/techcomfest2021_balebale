package com.khios.sitanibalebale.Activity.PengepulActivity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product
import com.khios.sitanibalebale.R

class AdapterTebasan(private val data:ArrayList<Product>, val clikc: OnclickItemListener): RecyclerView.Adapter<AdapterTebasan.TampilanList>(){


    class TampilanList(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvnamapanentoko = itemView.findViewById<TextView>(R.id.txt_nama_tebas_pengepul)
        val tvkategoripanentoko = itemView.findViewById<TextView>(R.id.txt_kategori_tebas_pengepul)
        val tvusiapanentoko = itemView.findViewById<TextView>(R.id.txt_usia_tebas_pengepul)
        val tvluaspanentoko = itemView.findViewById<TextView>(R.id.txt_luas_tebas_pengepul)
        val tvhargapanentoko = itemView.findViewById<TextView>(R.id.txt_harga_tebas_pengepul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TampilanList {
        return TampilanList(LayoutInflater.from(parent.context).inflate(R.layout.list_tebasan_pengepul, parent, false))
    }

    override fun onBindViewHolder(holder: TampilanList, position: Int) {
        val isi = data[position]
        Glide.with(holder.itemView.context)
        holder.tvnamapanentoko.text = isi.namaproduk
        holder.tvkategoripanentoko.text = isi.kategori
        holder.tvusiapanentoko.text = isi.usiaproduk
        holder.tvluaspanentoko.text = isi.luaslahan
        holder.tvhargapanentoko.text = isi.harga
        holder.itemView.setOnClickListener {
            clikc.clickItem(isi)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface OnclickItemListener{
        fun clickItem(objek: Product)
    }
}