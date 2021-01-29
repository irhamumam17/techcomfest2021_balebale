package com.khios.sitanibalebale.Activity.PetaniActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.R

class AkunActivity : AppCompatActivity() {
    private lateinit var btnlengkapiakun : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbarakun)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btnlengkapiakun = findViewById(R.id.btn_lengkapi_akun)
        btnlengkapiakun.setOnClickListener {
            startActivity(Intent(this, EditAkunActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DasboardPetaniActivity::class.java))
        return super.onSupportNavigateUp()
    }
}