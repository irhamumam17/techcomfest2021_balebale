package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.R

class WishlistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishlist)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbarwishlist)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DashboardPengepulActivity::class.java))
        return super.onSupportNavigateUp()
    }
}