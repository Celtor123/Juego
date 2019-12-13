package com.example.reto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_inter.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast

class InterActivity : AppCompatActivity() {

    //Se crea la activity secundaria
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inter)
        toast("Pulsa en el boton ¡¡¡")

        //AL pulsar el botón redirige a una imagen de la red
        botonint.setOnClickListener {
            browse("https://thumbs.gfycat.com/WeirdThriftyAmericanredsquirrel-size_restricted.gif")
        }
    }
}
