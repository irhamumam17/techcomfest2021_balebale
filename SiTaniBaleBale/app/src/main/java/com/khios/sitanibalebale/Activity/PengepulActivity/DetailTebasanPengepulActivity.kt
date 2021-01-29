package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.Activity.PetaniActivity.TokokuActivity
import com.khios.sitanibalebale.R

class DetailTebasanPengepulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tebasan_pengepul)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbardetailpengepul)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val id = intent.getStringArrayExtra("uid")
        val tvnamatebas : TextView = findViewById(R.id.txt_nama_tebasan_pengepul)
        val tvkategoritebas : TextView = findViewById(R.id.txt_kategori_detail_pengepul)
        val tvusiatebas : TextView = findViewById(R.id.txt_usia_tanam_pengepul)
        val tvluastebas : TextView = findViewById(R.id.txt_luas_jumlah_tenak_pengepul)
        val tvhargatebas : TextView = findViewById(R.id.txt_harga_panen_pengepul)
        val tvalamattebas : TextView = findViewById(R.id.txt_alamat_pemilik_pengepul)
        val tvnohptebas : TextView = findViewById(R.id.txt_nomor_hp_pemilik_pengepul)

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
        startActivity(Intent(this, TebasanPengepulActivity::class.java))
        return super.onSupportNavigateUp()
    }
}