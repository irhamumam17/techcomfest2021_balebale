package com.example.sitani.harga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khios.sitanibalebale.Activity.PengepulActivity.RanceHargaPengepulActivity
import com.khios.sitanibalebale.R
import java.util.ArrayList


class HargaTernakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harga_ternak)

        val arrayList = ArrayList<ModelTani>()

        arrayList.add(ModelTani("Sapi", "Rp.45000"))
        arrayList.add(ModelTani("Kerbau", "Rp.44000"))
        arrayList.add(ModelTani("Kambing", "Rp.43500"))
        arrayList.add(ModelTani("Domba", "Rp.42000"))
        arrayList.add(ModelTani("Ayam Broiler", "Rp.20000"))
        arrayList.add(ModelTani("Ayam Buras", "Rp.43500"))


        val myAdapter = AdapterTani(arrayList, this)

        val Rv=findViewById<RecyclerView>(R.id.rv_harga_ternak)
        Rv.layoutManager = LinearLayoutManager(this)
        Rv.adapter = myAdapter

        findViewById<ImageView>(R.id.im_close_ternak_harga).setOnClickListener {
            startActivity(Intent(this, RanceHargaPengepulActivity::class.java))
        }
    }
}