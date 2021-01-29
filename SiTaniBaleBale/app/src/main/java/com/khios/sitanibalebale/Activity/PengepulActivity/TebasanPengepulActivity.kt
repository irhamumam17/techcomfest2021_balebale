package com.khios.sitanibalebale.Activity.PengepulActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import com.google.firebase.storage.StorageReference
import com.khios.sitanibalebale.Activity.PengepulActivity.Adapter.AdapterTebasan
import com.khios.sitanibalebale.Activity.PetaniActivity.DetailTebasanActivity
import com.khios.sitanibalebale.Activity.PetaniActivity.ModelClass.Product
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_tebasan.*
import kotlinx.android.synthetic.main.activity_tebasan_pengepul.*
import kotlinx.android.synthetic.main.list_tebasan_pengepul.*
import java.util.*
import kotlin.collections.ArrayList

class TebasanPengepulActivity : AppCompatActivity() {

    private lateinit var produkdb : DatabaseReference
    private lateinit var proList : MutableList<Product>
    private lateinit var listPro : RecyclerView
    private lateinit var isifoto : StorageReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebasan_pengepul)
        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbartebas_pengepul)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        btn_add_wishlist_pengepul.setOnClickListener(View.OnClickListener {
            addWislist()
        })


        listPro = rcv_tebasan_pengepul
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
                rcv_tebasan_pengepul.layoutManager = LinearLayoutManager(this@TebasanPengepulActivity)
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

    private fun addWislist() {

        val uid = ""
        val namaproduk = ""
        val kategori = ""
        val usiaproduk = ""
        val luaslahan = ""
        val harga = ""
        val alamat = ""
        val nohp = ""
        startActivity(Intent(this@TebasanPengepulActivity, WishlistActivity::class.java)
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

    private fun intentshow(uid: String?, namaproduk: String?, kategori: String?, usiaproduk: String?, luaslahan: String?, harga: String?, alamat: String?, nohp: String?) {
        Toast.makeText(this@TebasanPengepulActivity, "Anda Memilih $namaproduk", Toast.LENGTH_SHORT).show()
        startActivity(
            Intent(this@TebasanPengepulActivity, DetailTebasanPengepulActivity::class.java)
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
        startActivity(Intent(this, DashboardPengepulActivity::class.java))
        return super.onSupportNavigateUp()
    }
}