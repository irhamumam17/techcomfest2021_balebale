package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import com.example.sitani.harga.HargaTernakActivity
import com.khios.sitanibalebale.Activity.PengepulActivity.Harga.HargaTaniActivity
import com.khios.sitanibalebale.R

class RanceHargaPengepulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rance_harga)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbarranceharga)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        findViewById<ImageView>(R.id.img_tani_rance).setOnClickListener {
            startActivity(Intent(this, HargaTaniActivity::class.java))
        }

        findViewById<ImageView>(R.id.img_ternak_rance).setOnClickListener {
            startActivity(Intent(this, HargaTernakActivity::class.java))
        }

        findViewById<ImageView>(R.id.close_to_pengepul).setOnClickListener {
            startActivity(Intent(this, DashboardPengepulActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DashboardPengepulActivity::class.java))
        return super.onSupportNavigateUp()
    }
}