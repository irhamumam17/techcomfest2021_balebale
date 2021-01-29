package com.khios.sitanibalebale.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import com.khios.sitanibalebale.Activity.PetaniActivity.DasboardPetaniActivity
import com.khios.sitanibalebale.R

class BeritaActivity : AppCompatActivity() {

    private lateinit var btndetailberita: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbarberita)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btndetailberita = findViewById(R.id.btn_berita1_petani)
        btndetailberita.setOnClickListener {
            startActivity(Intent(this, DetailBeritaActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DasboardPetaniActivity::class.java))
        return super.onSupportNavigateUp()
    }
}