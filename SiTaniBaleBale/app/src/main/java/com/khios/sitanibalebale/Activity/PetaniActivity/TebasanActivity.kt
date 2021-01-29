package com.khios.sitanibalebale.Activity.PetaniActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import com.google.firebase.storage.StorageReference
import com.khios.sitanibalebale.Activity.PengepulActivity.Adapter.AdapterTebasan
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_tebasan.*
import kotlinx.android.synthetic.main.activity_tokoku.*

class TebasanActivity : AppCompatActivity() {

    private lateinit var produkdb : DatabaseReference
    private lateinit var proList : MutableList<Product>
    private lateinit var listPro : RecyclerView
    private lateinit var isifoto : StorageReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebasan)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbartebas)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        listPro = rcv_tebasan
        produkdb = FirebaseDatabase.getInstance().getReference("petani")
        proList = ArrayList<Product>()
        produkdb.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot)
            {
                if (snapshot.exists())
                {
                    for (h : DataSnapshot in snapshot.children)
                    {
                        val product : Product? = h.getValue(Product::class.java)
                        if (product !== null)
                            proList.add(product)
                    }
                }
                rcv_tebasan.layoutManager = LinearLayoutManager(this@TebasanActivity)
                val adapter = AdapterTebasan(proList as ArrayList<Product>,object : AdapterTebasan.OnclickItemListener{
                    override fun clickItem(objek: Product) {
                        intentshow(objek.uid, objek.namaproduk, objek.kategori, objek.usiaproduk, objek.luaslahan, objek.harga, objek.alamat,objek.nohp)

                    }
                })
                listPro.adapter = adapter
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }

    private fun intentshow(uid: String?, namaproduk: String?, kategori: String?, usiaproduk: String?, luaslahan: String?, harga: String?, alamat: String?, nohp: String?) {
        Toast.makeText(this@TebasanActivity, "Anda Memilih $namaproduk", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this@TebasanActivity, DetailTebasanActivity::class.java)
                .putExtra("uid",uid)
                .putExtra("nama",namaproduk)
                .putExtra("kategori",kategori)
                .putExtra("usia",usiaproduk)
                .putExtra("luas",luaslahan)
                .putExtra("harga",harga)
                .putExtra("alamat",alamat)
                .putExtra("nohp",nohp)
        )


    }

    override fun onSupportNavigateUp(): Boolean {
        startActivity(Intent(this, DasboardPetaniActivity::class.java))
        return super.onSupportNavigateUp()
    }
}