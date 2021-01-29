package com.khios.sitanibalebale.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.khios.sitanibalebale.R

class DetailBeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)
        findViewById<ImageView>(R.id.ic_close_detail_berita_petani).setOnClickListener {
            startActivity(Intent(this, BeritaActivity::class.java))
            finish()
        }
    }
}