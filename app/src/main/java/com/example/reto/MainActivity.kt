package com.example.reto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {
    private var internet: Button? =null
    private var otro: Button? =null
    private var mate: Button? =null
    private var imagen: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Bienvenido, Elija el reto")
    }

    override fun onStart() {
        super.onStart()
        internet= findViewById(R.id.btnint)
        otro= findViewById(R.id.btnotr)
        mate= findViewById(R.id.btnmte)
        imagen= findViewById(R.id.btmima)
        internet?.setOnClickListener{
             toast("Ha elegido Internet")
        }
        otro?.setOnClickListener {
            toast("Ha elegido el OTRO")
        }
        mate?.setOnClickListener {
            toast("Ha elegido mate")
        }
        imagen?.setOnClickListener {
            toast("Ha elegido crear una imagen")
        }
    }
}
