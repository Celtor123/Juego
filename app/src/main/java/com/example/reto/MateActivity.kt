package com.example.reto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MateActivity : AppCompatActivity() {
    //creamos variables
    private var sal: TextView? = null
    private var e1: EditText? = null
    private var e2: EditText? = null
    private var suma: Button? = null
    private var resta: Button? = null
    private var multi: Button? = null
    private var division: Button? = null
    /*crea método que ejecuta la aplicacion del activity secundario
    e inicializamos la variables*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mate)
        sal=findViewById(R.id.salida)
        e1=findViewById(R.id.entrada1)
        e2=findViewById(R.id.entrada2)
        suma = findViewById(R.id.botonsuma)
        resta = findViewById(R.id.botonresta)
        multi = findViewById(R.id.botonmulti)
        division = findViewById(R.id.botondiv)
    }

    //Ejecuta este método cada vez que se inicializa la activity
    override fun onStart() {
        super.onStart()
        Log.d("MAteActivity", "Iniciado")


        /*métodos en el que al activar el boton correspondiente, recojen los valores
        ingresados en los edittext y hacen el correspondiente cálculo */
        division?.setOnClickListener {
            val n1 = Integer.parseInt(e1?.text.toString())

            val n2 = Integer.parseInt(e2?.text.toString())
               if(n1>n2){
                   val div=n1/n2
                   sal?.setText(div.toString())
               }
            if(n2>n1){
                val div=n2/n1
                sal?.setText(div.toString())
            }
            if(n1==n2){
                val div=1
                sal?.setText(div.toString())
            }
        }

        multi?.setOnClickListener {
            val n1 = Integer.parseInt(e1?.text.toString())

            val n2 = Integer.parseInt(e2?.text.toString())

                val resul=n1*n2
                sal?.setText(resul.toString())


        }

        suma?.setOnClickListener {
            val n1 = Integer.parseInt(e1?.text.toString())

            val n2 = Integer.parseInt(e2?.text.toString())

                val suma = n1 + n2
                sal?.setText(suma.toString())

        }

        resta?.setOnClickListener {
            val n1 = Integer.parseInt(e1?.text.toString())

            val n2 = Integer.parseInt(e2?.text.toString())

                val restado=n1-n2
                sal?.setText(restado.toString())

        }
    }
}
