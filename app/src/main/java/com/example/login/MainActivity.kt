package com.example.login


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lb.setOnClickListener(){
            var value: Any = Intent j = new Intent(
                this, grid.class)
                var status = if(un.text.toString().equals(String)
                &&pass.text.toString().equals(String))"successful" else "login fail"

                Toast.makeText(this,status, Toast.LENGTH_SHORT).show()





        }

        val un= findViewById<EditText>(R.id.un)
        var joe = un.text.toString()
        val textView4 = findViewById<TextView>(R.id.textView4)
        textView4.text=un.text
    }
}

