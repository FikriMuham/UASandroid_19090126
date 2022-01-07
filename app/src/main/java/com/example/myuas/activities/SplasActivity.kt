package com.example.myuas.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myuas.MainActivity
import com.example.myuas.R

class SplasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java).also { finish() })
        }, 3000)
    }
}