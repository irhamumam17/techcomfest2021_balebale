package com.khios.sitanibalebale.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.khios.sitanibalebale.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val textview =  findViewById<TextView>(R.id.tv_get_splash)
        textview.setOnClickListener { startActivity(Intent(this,LoginActivity::class.java)) }
    }
}