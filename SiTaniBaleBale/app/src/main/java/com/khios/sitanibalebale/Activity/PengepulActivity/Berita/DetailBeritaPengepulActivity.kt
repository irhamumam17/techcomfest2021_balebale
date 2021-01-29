package com.khios.sitanibalebale.Activity.PengepulActivity.Berita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.khios.sitanibalebale.R

class DetailBeritaPengepulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita_pengepul)

        findViewById<ImageView>(R.id.ic_close_detail_berita_pengepul).setOnClickListener {
            startActivity(Intent(this, BeritaPengepulActivity::class.java))
        }
    }
}