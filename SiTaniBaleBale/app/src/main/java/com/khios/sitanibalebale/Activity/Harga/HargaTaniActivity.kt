package com.khios.sitanibalebale.Activity.Harga

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sitani.harga.AdapterTani
import com.example.sitani.harga.ModelTani
import com.khios.sitanibalebale.R
import java.util.*

class HargaTaniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harga_tani)
        val arrayList = ArrayList<ModelTani>()

        arrayList.add(ModelTani("BAWANG MERAH", "Rp.17.000"))
        arrayList.add(ModelTani("BERAS KETAN", "Rp.9.000"))
        arrayList.add(ModelTani("GABAH", "Rp.8.500"))
        arrayList.add(ModelTani("JAGUNG", "Rp.3.800"))
        arrayList.add(ModelTani("KEDELAI", "Rp.8.500"))
        arrayList.add(ModelTani("BAWANG MERAH", "Rp.17.000"))
        arrayList.add(ModelTani("BERAS KETAN", "Rp.9.000"))
        arrayList.add(ModelTani("GABAH", "Rp.8.500"))
        arrayList.add(ModelTani("JAGUNG", "Rp.3.800"))
        arrayList.add(ModelTani("KEDELAI", "Rp.8.500"))

        val myAdapter = AdapterTani(arrayList, this)

        val Rv=findViewById<RecyclerView>(R.id.rv_harga_tani)
        Rv.layoutManager = LinearLayoutManager(this)
        Rv.adapter = myAdapter


        findViewById<ImageView>(R.id.im_close_tani_harga).setOnClickListener {
            startActivity(Intent(this, RanceHargaActivity::class.java))
        }
    }
}