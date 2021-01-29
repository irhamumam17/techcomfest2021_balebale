package com.khios.sitanibalebale.Activity.PengepulActivity.Berita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import com.khios.sitanibalebale.Activity.PengepulActivity.DashboardPengepulActivity
import com.khios.sitanibalebale.R

class BeritaPengepulActivity : AppCompatActivity() {
    private lateinit var btndetailberitapengepul : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita_pengepul)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbarberitapengepul)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        btndetailberitapengepul = findViewById(R.id.btn_berita1_pengepul)
        btndetailberitapengepul.setOnClickListener {
            startActivity(Intent(this,DetailBeritaPengepulActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DashboardPengepulActivity::class.java))
        return super.onSupportNavigateUp()
    }
}