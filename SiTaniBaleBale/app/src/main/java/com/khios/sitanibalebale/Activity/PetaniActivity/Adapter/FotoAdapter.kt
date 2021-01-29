package com.khios.sitanibalebale.Activity.PetaniActivity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Foto
import com.khios.sitanibalebale.R

class FotoAdapter(private val foto:ArrayList<Foto>): RecyclerView.Adapter<FotoAdapter.DaftarFoto>(){
    class DaftarFoto(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.iv_uploadproduct)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FotoAdapter.DaftarFoto {
        return DaftarFoto(LayoutInflater.from(parent.context).inflate(R.layout.activity_tokoku, parent, false))
    }

    override fun onBindViewHolder(holder: FotoAdapter.DaftarFoto, position: Int) {
        val isi = foto[position]
        Glide.with(holder.itemView.context)
                .load(isi)
                .into(holder.image)
    }

    override fun getItemCount(): Int {
        return foto.size
    }

}