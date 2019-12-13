package com.example.reto

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {
    //Creamos valores para manejar los elementos
    private var internet: Button? =null
    private var otro: Button? =null
    private var mate: Button? =null
    private var imagen: Button? =null

    //metodo que crea la aplicación
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Bienvenido, Elija el reto")
        Log.d("Estado","Empezando")
    }
    //método para cada vez que se inicia la aplicación
    // Aquí inicio los valores e implemento el método onclick para cambiar el color,
    // y que a través de un intent me lleven a una activity secundaria
    override fun onStart() {
        super.onStart()
        Log.d("Estado","Iniciado")
        toast("Seleccione un Reto")
        internet= findViewById(R.id.btnint)
        otro= findViewById(R.id.btnotr)
        mate= findViewById(R.id.btnmte)
        imagen= findViewById(R.id.btmima)

        //método del reto internet
        internet?.setOnClickListener{
            Log.d("Bton sel","Internet")
            val intento= Intent(this,InterActivity::class.java)

            internet?.setBackgroundColor(Color.BLUE)

            startActivity(intento)
        }

        //método del reto internet
        mate?.setOnClickListener {
            Log.d("Bton sel","Matemáticas")
            val intento2= Intent(this,MateActivity::class.java)

            mate?.setBackgroundColor(Color.BLUE)

            startActivity(intento2)
        }

        //método de mi reto
        otro?.setOnClickListener {
            Log.d("Bton sel","Otro")

        }

        //método del reto Imagen
        imagen?.setOnClickListener { v ->
            Log.d("Bton sel","Imagen")
                imagen!!.setBackgroundColor(Color.BLUE)
            val intent = Intent(this, CamaraActivity::class.java)
            startActivity(intent)
        }

    }

}
