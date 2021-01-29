package com.khios.sitanibalebale.Activity.PetaniActivity

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_tambah_product.*
import kotlinx.android.synthetic.main.update_dialog_product.*


class TambahProductActivity : AppCompatActivity() {

    private lateinit var produkdb : DatabaseReference
    private lateinit var filepath: Uri
    private lateinit var gambar: ImageView
    var produkId:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_product)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbartambahtoko)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

//        btn_lihat_toko.setOnClickListener {
//            val intenlihattoko = Intent(this@TambahProductActivity, TokokuActivity::class.java)
//            startActivity(intenlihattoko)
//            finish()
//        }
//        iv_uploadproduct.setOnClickListener {
//            pilihGambar()
//        }
        produkdb = FirebaseDatabase.getInstance().getReference("petani")
        saveBtn.setOnClickListener {
            TambahProduct()
            uploadFile()
        }
    }

    private fun pilihGambar() {
        var i = Intent()
        i.setType("image/*")
        i.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(Intent.createChooser(i, "Choose Picture"), 111)
    }

    private fun TambahProduct() {
        val namaproduk:String = in_nama_product.text.toString().trim()
        val kategori:String = in_kategori_product.text.toString().trim()
        val usiaproduk:String = in_usia_tanam.text.toString().trim()
        val luaslahan:String = in_luas_jumlah.text.toString().trim()
        val harga:String = in_harga.text.toString().trim()
        val alamat:String = in_alamat.text.toString().trim()
        val nohp:String = in_nohp.text.toString().trim()

        if (namaproduk.isEmpty())
        {
            in_nama_product.error = "Masukan Nama Produk"
            return
        }
        else if (kategori.isEmpty())
        {
            in_kategori_product.error = "Masukan Kategori"
            return
        }
        else if (usiaproduk.isEmpty())
        {
            in_usia_tanam.error = "Masukan Usia Produk"
        }
        else if (luaslahan.isEmpty())
        {
            in_luas_jumlah.error = "Masukan Luas Lahan"
            return
        }
        else if (harga.isEmpty())
        {
            in_harga.error = "Masukan Harga"
            return
        }
        else if (alamat.isEmpty())
        {
            in_alamat.error = "Masukan Alamat"
        }
        else if (nohp.isEmpty())
        {
            in_nohp.error = "Masukan No Handphone"
        }
        val produkId: String? = produkdb.push().key
        val produk = Product(produkId, namaproduk, kategori, usiaproduk, luaslahan, harga, alamat, nohp)
        if (produkId != null)
        {
            produkdb.child(produkId).setValue(produk).addOnCompleteListener {
                saveBtn.setOnClickListener {
                    Toast.makeText(this@TambahProductActivity, "Produk Berhasil Ditambahkan",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    private fun uploadFile() {
        if(filepath != null){
            var pd = ProgressDialog(this)
            pd.setTitle("uploading")
            pd.show()

            var imageReference = FirebaseStorage.getInstance().reference.child("images/$produkId.png")
            imageReference.putFile(filepath)
                .addOnSuccessListener {p0 ->
                    pd.dismiss()
                    Toast.makeText(this, "Uploded File", Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener {p0 ->
                    pd.dismiss()
                    Toast.makeText(this,p0.message, Toast.LENGTH_LONG).show()
                }
                .addOnProgressListener {p0 ->
                    var progres :Double = (100.0 * p0.bytesTransferred) / p0.totalByteCount
                    pd.setMessage("Uploaded ${progres.toInt()} %")
                    if(progres == 100.0){
                        startActivity(Intent(this,TokokuActivity::class.java))
                        finish()
                    }
                }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}