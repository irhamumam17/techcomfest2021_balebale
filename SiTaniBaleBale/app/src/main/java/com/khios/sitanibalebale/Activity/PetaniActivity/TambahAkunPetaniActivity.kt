package com.khios.sitanibalebale.Activity.PetaniActivity

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.khios.sitanibalebale.R

class TambahAkunPetaniActivity : AppCompatActivity() {

    private lateinit var refAkun: DatabaseReference
    private var firebaseAkunId: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_akun_petani)
    }
}