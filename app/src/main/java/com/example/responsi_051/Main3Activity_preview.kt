package com.example.responsi_051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2_register.*
import kotlinx.android.synthetic.main.activity_main3_preview.*

class Main3Activity_preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3_preview)

        var intent = intent
        val nama_o = intent.getStringExtra("nama")
        val user_o = intent.getStringExtra("user")
        val email_o = intent.getStringExtra("email")
        val pass_o = intent.getStringExtra("pass")
        val login = findViewById<Button>(R.id.login_now)


        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Nama : "+nama_o+"\nUser name: "+user_o+"\nE-mail: "+email_o


        login.setOnClickListener() {

            intent= Intent(this,MainActivity::class.java)
            intent.putExtra("nama",nama_o)
            intent.putExtra("user",user_o)
            intent.putExtra("email",email_o)
            intent.putExtra("pass",pass_o)
            startActivity(intent)
        }

    }
}
