package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.R

class AkunPengepulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun_pengepul)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbarakunpengepul)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        findViewById<Button>(R.id.btn_lengkapi_akun_pengepul).setOnClickListener {
            startActivity(Intent(this, EditAkunPengepulActivity::class.java))
            finish()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DashboardPengepulActivity::class.java))
        return super.onSupportNavigateUp()
    }
}