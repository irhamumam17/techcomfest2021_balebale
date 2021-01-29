package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khios.sitanibalebale.Activity.Harga.RanceHargaActivity
import com.khios.sitanibalebale.Activity.LoginActivity
import com.khios.sitanibalebale.Activity.PengepulActivity.Berita.BeritaPengepulActivity
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_dashboard_pengepul.*

class DashboardPengepulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_pengepul)

        btn_tebasan_pengepul.setOnClickListener {
            val intenttebaspengepul = Intent(this, TebasanPengepulActivity::class.java)
            startActivity(intenttebaspengepul)
            finish()
        }
        btn_lishharganasional_pengepul.setOnClickListener {
            val intenthargapengepul = Intent(this,RanceHargaActivity::class.java)
            startActivity(intenthargapengepul)
            finish()
        }
        btn_wishlist_pengepul.setOnClickListener {
            val intentwislist = Intent(this, WishlistActivity::class.java)
            startActivity(intentwislist)
            finish()
        }
        btn_berita_pengepul.setOnClickListener {
            startActivity(Intent(this, BeritaPengepulActivity::class.java))
            finish()
        }
        btn_keluar_pengepul.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        btn_akun_pengepul.setOnClickListener {
            startActivity(Intent(this, AkunPengepulActivity::class.java))
            finish()
        }
    }
}