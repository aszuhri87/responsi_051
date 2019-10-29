package com.example.responsi_051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main4Activity_dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4_dashboard)

        val intent = intent
        val nama_o = intent.getStringExtra("nama")
        val user_o = intent.getStringExtra("user")
        val email_o = intent.getStringExtra("email")

        val nam = intent.getStringExtra("nama")
        val usr = intent.getStringExtra("user")
        val emel = intent.getStringExtra("email")


        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Nama : "+nama_o+"\nUser name: "+user_o+"\nE-mail: "+email_o

    }
}
