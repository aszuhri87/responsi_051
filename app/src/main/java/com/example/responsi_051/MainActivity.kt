package com.example.responsi_051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.app.Dialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val username = findViewById<EditText>(R.id.user)
        val passw = findViewById<EditText>(R.id.pass)
        val login = findViewById<Button>(R.id.login_btn)

        val dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialoge)

        login_btn.setOnClickListener() {

            val nama_o = intent.getStringExtra("nama")
            val user_from = intent.getStringExtra("user")
            val pass_from = intent.getStringExtra("pass")
            val email_o = intent.getStringExtra("email")
            val user_o = user.text.toString()
            val pass_o = pass.text.toString()
            val nam="zuhri"
            val usr="zuhri"
            val emel="achmad.s.zuhri182@gmail.com"

            if(user_o==user_from && pass_o==pass_from){

                intent = Intent(this, Main4Activity_dashboard::class.java)
                    intent.putExtra("nama",nama_o)
                    intent.putExtra("user",user_o)
                    intent.putExtra("email",email_o)
                    intent.putExtra("pass",pass_o)
                    startActivity(intent)
            }
            else if(user_o=="zuhri" && pass_o=="123"){
                intent = Intent(this, Main4Activity_dashboard::class.java)
                    intent.putExtra("nama",nam)
                    intent.putExtra("user",usr)
                    intent.putExtra("email",emel)
                    startActivity(intent)
            }
            else{
                val text = dialog.findViewById(R.id.dialog) as TextView
                text.text = "login gagal cuy silahkan ulangi!"
                dialog.show()
            }
        }

        reg_btn.setOnClickListener() {

            intent = Intent(this, Main2Activity_register::class.java)

            startActivity(intent)
        }
    }
}
