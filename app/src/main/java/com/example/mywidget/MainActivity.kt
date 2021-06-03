package com.example.mywidget

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.imageButton2)
        imgBtn.setOnClickListener {
            Toast.makeText(this@MainActivity,"Berhasil",Toast.LENGTH_LONG).show()

        }

        }
    }
