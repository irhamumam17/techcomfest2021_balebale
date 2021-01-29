package com.khios.sitanibalebale.Activity.PetaniActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.khios.sitanibalebale.Activity.BeritaActivity
import com.khios.sitanibalebale.Activity.Harga.RanceHargaActivity
import com.khios.sitanibalebale.Activity.LoginActivity
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_dasboard_petani.*

class DasboardPetaniActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard_petani)

        btn_berita.setOnClickListener {
            val intentberita = Intent(this@DasboardPetaniActivity, BeritaActivity::class.java)
            startActivity(intentberita)
            finish()
        }

        btn_lishharganasional.setOnClickListener {
            val intenharga = Intent(this@DasboardPetaniActivity, RanceHargaActivity::class.java)
            startActivity(intenharga)
            finish()
        }

        btn_tebasan.setOnClickListener {
            val intenttebas = Intent(this@DasboardPetaniActivity, TebasanActivity::class.java)
            startActivity(intenttebas)
            finish()
        }

        btn_tokoku.setOnClickListener {
            val intenttambahproduk = Intent(this@DasboardPetaniActivity, TokokuActivity::class.java)
            startActivity(intenttambahproduk)
            finish()
        }

        btn_akun.setOnClickListener {
            val intentakun = Intent(this@DasboardPetaniActivity, AkunActivity::class.java)
            startActivity(intentakun)
            finish()
        }

        btn_keluar.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}