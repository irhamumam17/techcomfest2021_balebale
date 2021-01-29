package com.khios.sitanibalebale.Activity.PetaniActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.*
import com.google.firebase.storage.StorageReference
import com.khios.sitanibalebale.Activity.PetaniActivity.Adapter.AdapterProduct
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_tokoku.*

class TokokuActivity : AppCompatActivity() {

    private lateinit var produkdb : DatabaseReference
    private lateinit var proList : MutableList<Product>
    private lateinit var listPro : RecyclerView
    private lateinit var isifoto :StorageReference
    private lateinit var btnaddproducttokoku : FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tokoku)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbartoko)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btnaddproducttokoku = findViewById(R.id.btn_add_product_tokoku)
        btnaddproducttokoku.setOnClickListener {
            startActivity(Intent(this, TambahProductActivity::class.java))

        }

        listPro = rcv_tokoku
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
                rcv_tokoku.layoutManager = LinearLayoutManager(this@TokokuActivity)
                val adapter = AdapterProduct(proList as ArrayList<Product>,object : AdapterProduct.OnclickItemListener{
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
        Toast.makeText(this@TokokuActivity, "Anda Memilih $uid", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this@TokokuActivity, DetailProductActivity::class.java)
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