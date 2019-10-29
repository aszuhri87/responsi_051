package com.example.responsi_051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2_register.*

class Main2Activity_register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_register)


        val nama = findViewById<EditText>(R.id.nama_reg)
        val username_reg = findViewById<EditText>(R.id.username_reg)
        val email_reg = findViewById<EditText>(R.id.email)
        val passwerd = findViewById<EditText>(R.id.pass_reg)
        val regnow = findViewById<Button>(R.id.reg_now)




        regnow.setOnClickListener(){
            val nama_o =nama_reg.text.toString()
            val user_o=username_reg.text.toString()
            val email_o=email_reg.text.toString()
            val pass_o=pass_reg.text.toString()


            intent= Intent(this,Main3Activity_preview::class.java)
            intent.putExtra("nama",nama_o)
            intent.putExtra("user",user_o)
            intent.putExtra("email",email_o)
            intent.putExtra("pass",pass_o)
            startActivity(intent)
        }
    }
}
