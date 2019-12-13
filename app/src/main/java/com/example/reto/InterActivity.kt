package com.example.reto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inter.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast

class InterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inter)
        toast("Pulsa en el boton ¡¡¡")
        botonint.setOnClickListener {

            browse("https://tenor.com/view/f1-baku2017-crash-vettel-hamilton-gif-11732251")

        }
    }
}
