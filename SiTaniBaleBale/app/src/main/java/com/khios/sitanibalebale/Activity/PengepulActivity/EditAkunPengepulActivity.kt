package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.R

class EditAkunPengepulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_akun_pengepul)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbareditakunpengepul)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, AkunPengepulActivity::class.java))
        finish()
        return super.onSupportNavigateUp()
    }
}