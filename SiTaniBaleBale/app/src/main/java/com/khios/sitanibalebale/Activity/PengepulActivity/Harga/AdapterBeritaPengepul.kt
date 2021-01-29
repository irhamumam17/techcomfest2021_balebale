package com.khios.sitanibalebale.Activity.PengepulActivity.Harga

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.khios.sitanibalebale.R

class AdapterBeritaPengepul (val arrayList: ArrayList<ModelTani>, val context: Context) :
    RecyclerView.Adapter<AdapterBeritaPengepul.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: ModelTani){
            itemView.findViewById<TextView>(R.id.txt_title_produk).text = model.title
            itemView.findViewById<TextView>(R.id.txt_harganya_tani).text = model.harga
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterBeritaPengepul.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_harga_tani, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }


    override fun onBindViewHolder(holder: AdapterBeritaPengepul.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
    }

}
