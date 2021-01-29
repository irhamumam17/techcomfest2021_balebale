package com.khios.sitanibalebale.Activity.PetaniActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.khios.sitanibalebale.R

class EditAkunActivity : AppCompatActivity() {
    private lateinit var btnsaveediakun : FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_akun)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbareditakun)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btnsaveediakun = findViewById(R.id.btnsaveakun)
        btnsaveediakun.setOnClickListener {
            startActivity(Intent(this, AkunActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}