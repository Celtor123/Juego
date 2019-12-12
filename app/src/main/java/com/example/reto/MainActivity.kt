package com.example.reto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var internet: Button? =null
    private var otro: Button? =null
    private var mate: Button? =null
    private var imagen: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        internet= findViewById(R.id.btnint)
        otro= findViewById(R.id.bottom)
        mate= findViewById(R.id.btnmte)
        imagen= findViewById(R.id.btmima)
        internet?.setOnClickListener{

        }
        otro?.setOnClickListener {

        }
        mate?.setOnClickListener {

        }
        imagen?.setOnClickListener {

        }
    }
}
