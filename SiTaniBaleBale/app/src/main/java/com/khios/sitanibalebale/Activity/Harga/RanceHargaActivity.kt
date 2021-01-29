package com.khios.sitanibalebale.Activity.Harga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.khios.sitanibalebale.Activity.PengepulActivity.DashboardPengepulActivity
import com.khios.sitanibalebale.Activity.PetaniActivity.DasboardPetaniActivity
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_rance_harga.*


class RanceHargaActivity : AppCompatActivity() {
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

        img_tani_rance.setOnClickListener {
            val intenrancetani = Intent(this@RanceHargaActivity, HargaTaniActivity::class.java)
            startActivity(intenrancetani)
            finish()
        }

        img_ternak_rance.setOnClickListener {
            val intenranceternak = Intent(this@RanceHargaActivity, HargaTernakActivity::class.java)
            startActivity(intenranceternak)
            finish()
        }
        close_to_pengepul.setOnClickListener {
            startActivity(Intent(this, DashboardPengepulActivity::class.java))
            finish()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DasboardPetaniActivity::class.java))
        return super.onSupportNavigateUp()
    }
}