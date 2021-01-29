package com.khios.sitanibalebale.Activity.PetaniActivity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product
import com.khios.sitanibalebale.R


class AdapterProduct(private val data:ArrayList<Product>, val clikc: OnclickItemListener): RecyclerView.Adapter<AdapterProduct.TampilanList>(){


    class TampilanList(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvnamapanentoko = itemView.findViewById<TextView>(R.id.txt_nama_panen)
        val tvkategoripanentoko = itemView.findViewById<TextView>(R.id.txt_kategori)
        val tvusiapanentoko = itemView.findViewById<TextView>(R.id.txt_usia_tanamternak)
        val tvluaspanentoko = itemView.findViewById<TextView>(R.id.txt_luas_jumlah)
        val tvhargapanentoko = itemView.findViewById<TextView>(R.id.txt_harga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TampilanList {
        return TampilanList(LayoutInflater.from(parent.context).inflate(R.layout.list_tokoku, parent, false))
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
        fun clickItem(objek:Product)
    }
}

//class AdapterProduct(val mCtx : Context, val layoutResId : Int, val prolist : List<Product>): ArrayAdapter<Product>(mCtx,layoutResId,prolist) {
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
//    {
//        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)
//        val view : View = layoutInflater.inflate(layoutResId,null)
//
//        val tvnamapanentoko : TextView = view.findViewById(R.id.in_nama_product)
//        val tvkategoripanentoko : TextView = view.findViewById(R.id.in_kategori_product)
//        val tvusiapanentoko : TextView = view.findViewById(R.id.in_usia_tanam)
//        val tvluaspanentoko : TextView = view.findViewById(R.id.in_luas_jumlah)
//        val tvhargapanentoko : TextView = view.findViewById(R.id.in_harga)
//        val btnedittoko : Button = view.findViewById(R.id.btn_edit_toko)
//
//        val produk : Product = prolist[position]
//        btnedittoko.setOnClickListener {
//            showUpdatedialog(produk)
//        }
//
//        tvnamapanentoko.text = produk.namaproduk
//        tvkategoripanentoko.text = produk.kategori
//        tvusiapanentoko.text = produk.usiaproduk
//        tvluaspanentoko.text = produk.luaslahan
//        tvhargapanentoko.text = produk.harga
//        view.setOnClickListener {
//
//        }
//        return view
//    }
//
//    private fun showUpdatedialog(produk: Product)
//    {
//        val builder = AlertDialog.Builder(mCtx)
//        builder.setTitle("Edit Data Product")
//        val inflater : LayoutInflater = LayoutInflater.from(mCtx)
//        val view : View = inflater.inflate(R.layout.update_dialog_product,null)
//
//        val etnamaupdate : EditText = view.findViewById(R.id.txt_nama_panen)
//        val etkategoriupdate : EditText = view.findViewById(R.id.txt_kategori)
//        val etusiaupdate : EditText = view.findViewById(R.id.txt_usia_tanam)
//        val etluasupdate : EditText = view.findViewById(R.id.txt_luas_jumlah_tenak)
//        val ethargaupdate : EditText = view.findViewById(R.id.txt_harga_panen)
//        val etalamatupdate : EditText = view.findViewById(R.id.in_alamat)
//        val etnoupdate : EditText = view.findViewById(R.id.in_nohp)
//
//        etnamaupdate.setText(produk.namaproduk)
//        etkategoriupdate.setText(produk.kategori)
//        etusiaupdate.setText(produk.usiaproduk)
//        etluasupdate.setText(produk.luaslahan)
//        ethargaupdate.setText(produk.harga)
//        etalamatupdate.setText(produk.alamat)
//        etnoupdate.setText(produk.nohp)
//
//        val dbPro : DatabaseReference = FirebaseDatabase.getInstance().getReference("petani")
//
//        val nama : String = etnamaupdate.text.toString()
//        val kategori : String = etkategoriupdate.text.toString()
//        val usia : String = etusiaupdate.text.toString()
//        val luas : String = etluasupdate.text.toString()
//        val harga : String = ethargaupdate.text.toString()
//        val alamat : String = etalamatupdate.text.toString()
//        val nohp : String = etnoupdate.text.toString()
//
//        if (nama.isEmpty())
//        {
//            etnamaupdate.error = "Isi Nama Product"
//            etnamaupdate.requestFocus()
//            return
//        }
//        else if (kategori.isEmpty())
//        {
//            etkategoriupdate.error = "Isi Kategori Produk"
//            etkategoriupdate.requestFocus()
//            return
//        }
//        else if (usia.isEmpty())
//        {
//            etusiaupdate.error = "Isi Usia Produk"
//            etusiaupdate.requestFocus()
//            return
//        }
//        else if (luas.isEmpty())
//        {
//            etluasupdate.error = "Isi Luas Lahan"
//            etluasupdate.requestFocus()
//            return
//        }
//        else if (harga.isEmpty())
//        {
//            ethargaupdate.error = "Isi Harga Produk"
//            ethargaupdate.requestFocus()
//            return
//        }
//        else if (alamat.isEmpty())
//        {
//            etalamatupdate.error = "Isi Alamat "
//            etalamatupdate.requestFocus()
//            return
//        }
//        else if (nohp.isEmpty())
//        {
//            etnoupdate.error = "Isi Nomer Handphone"
//            etnoupdate.requestFocus()
//            return
//        }
//
//        val dbproduk = Product(produk.uid, nama, kategori, usia, luas, harga, alamat, nohp)
//        dbPro.child(produk.uid!!).setValue(dbproduk)
//        Toast.makeText(mCtx,"Data Berhasil Update", Toast.LENGTH_SHORT).show()
//
//        builder.setView(view)
//        builder.setPositiveButton("Update Product")
//        {
//            p0, p1->
//        }
//        builder.setNegativeButton("Batalkan Update Product")
//        {
//            p2,p3 ->
//        }
//        val alert : AlertDialog = builder.create()
//        alert.show()
//    }
//}