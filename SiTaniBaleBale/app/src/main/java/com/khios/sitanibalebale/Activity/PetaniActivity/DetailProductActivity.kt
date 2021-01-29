package com.khios.sitanibalebale.Activity.PetaniActivity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.R

class DetailProductActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbardetail)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val id = intent.getStringArrayExtra("uid")
        val tvnamatebas : TextView = findViewById(R.id.txt_nama_tebasan)
        val tvkategoritebas : TextView = findViewById(R.id.txt_kategori_detail)
        val tvusiatebas : TextView = findViewById(R.id.txt_usia_tanam)
        val tvluastebas : TextView = findViewById(R.id.txt_luas_jumlah_tenak)
        val tvhargatebas : TextView = findViewById(R.id.txt_harga_panen)
        val tvalamattebas : TextView = findViewById(R.id.txt_alamat_pemilik)
        val tvnohptebas : TextView = findViewById(R.id.txt_nomor_hp_pemilik)

        val nama = intent.getStringExtra("nama")
        val kategori = intent.getStringExtra("kategori")
        val usia = intent.getStringExtra("usia")
        val luas = intent.getStringExtra("luas")
        val harga = intent.getStringExtra("harga")
        val alamat = intent.getStringExtra("alamat")
        val nohp = intent.getStringExtra("nohp")

        tvnamatebas.text = nama
        tvkategoritebas.text = kategori
        tvusiatebas.text = usia
        tvluastebas.text = luas
        tvhargatebas.text = harga
        tvalamattebas.text = alamat
        tvnohptebas.text = nohp

    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, TokokuActivity::class.java))
        return super.onSupportNavigateUp()
    }

}