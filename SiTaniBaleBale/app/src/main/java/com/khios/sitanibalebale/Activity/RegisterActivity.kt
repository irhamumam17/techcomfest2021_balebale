package com.khios.sitanibalebale.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.khios.sitanibalebale.R
import kotlinx.android.synthetic.main.activity_register.*

class   RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var refUsers: DatabaseReference
    private var firebaseUserId: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<TextView>(R.id.tvregis_masuk).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        auth = FirebaseAuth.getInstance()
        btn_register.setOnClickListener {
            registerUser()
        }
    }
    private fun registerUser()
    {
      val username : String = etregis_nama.text.toString()
      val email : String = etregis_email.text.toString()
      val password : String = etregis_password.text.toString()

        if (username == "")
        {
            Toast.makeText(this@RegisterActivity,"Masukan Username",Toast.LENGTH_LONG).show()
        }
        else if (email == "")
        {
            Toast.makeText(this@RegisterActivity,"Masukan Email",Toast.LENGTH_LONG).show()
        }
        else if (password == "")
        {
            Toast.makeText(this@RegisterActivity,"Masukan Password",Toast.LENGTH_LONG).show()
        }
        else
        {
            auth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener{ task ->
                        if (task.isSuccessful)
                        {
                            firebaseUserId = auth.currentUser!!.uid
                            refUsers = FirebaseDatabase.getInstance().reference.child("Users").child(firebaseUserId)
                            val usersHasMap = HashMap<String, Any>()
                            usersHasMap["uid"] = firebaseUserId
                            usersHasMap["username"] = username

                            refUsers.updateChildren(usersHasMap)
                                    .addOnCompleteListener { task ->
                                        if (task.isSuccessful)
                                        {
                                            val intenlogin = Intent(this@RegisterActivity,LoginActivity::class.java)
                                            intenlogin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                                            startActivity(intenlogin)
                                            finish()
                                        }
                                    }
                        }
                        else
                        {
                            Toast.makeText(this@RegisterActivity,"Error:" + task.exception!!.message.toString(),Toast.LENGTH_LONG).show()

                        }
                    }
        }

    }
}