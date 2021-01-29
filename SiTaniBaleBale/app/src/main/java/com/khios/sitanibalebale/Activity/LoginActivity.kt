package com.khios.sitanibalebale.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.khios.sitanibalebale.Activity.PengepulActivity.DashboardPengepulActivity
import com.khios.sitanibalebale.Activity.PetaniActivity.DasboardPetaniActivity
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        tvlogin_buatakun.setOnClickListener {
            val intenbuatakun = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(intenbuatakun)
            finish()
        }
        btn_login_pengepul.setOnClickListener {
            val intenloginpengepul = Intent(this@LoginActivity, DashboardPengepulActivity::class.java)
            startActivity(intenloginpengepul)
            finish()
        }
        auth = FirebaseAuth.getInstance()
        btn_login_petani.setOnClickListener {
            loginUser()
        }
    }

    private fun loginUser()
    {
        val email : String = etlogin_email.text.toString()
        val password : String = etlogin_password.text.toString()

        if (email == "")
        {
            Toast.makeText(this@LoginActivity,"Masukan Email", Toast.LENGTH_LONG).show()
        }
        else if (password == "")
        {
            Toast.makeText(this@LoginActivity,"Masukan Password",Toast.LENGTH_LONG).show()
        }
        else
        {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful)
                    {
                        val intenlogin = Intent(this@LoginActivity, DasboardPetaniActivity::class.java)
                        intenlogin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(intenlogin)
                        finish()
                    }
                    else
                    {
                        Toast.makeText(this@LoginActivity,"Error:" + task.exception!!.message.toString(),Toast.LENGTH_LONG).show()

                    }
                }
        }
    }
}