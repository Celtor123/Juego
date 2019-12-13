package com.example.reto

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class OtraActivity : AppCompatActivity() {
    //crea las variables
    private var boton:Button? = null
    private var boton2:Button? = null
    var resul = (0..1).random()

    //ejecuta la Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra)
        val rand = (0..10).random()
        val rand2 = (0..10).random()

        //inicialización variables
        boton=findViewById(R.id.bton1)
        boton?.text=rand.toString()
        boton2=findViewById(R.id.bton2)
        boton2?.text=rand2.toString()
        operacion()
        toast("Acierte el botón")
    }

    //Método en el que se hace las operaciones al hacer una u otra acción y sale de la aplicación
    fun operacion(){
        if(resul==1){
            boton?.onClick {
               toast("Acierto")
                finish()
            }
            boton2?.onClick {
                 toast("Fallo")
                finish()
            }
        }
        else{
            boton?.onClick {
                  toast("Fallo")
                finish()
            }
            boton2?.onClick {
                toast("Acierto")
                finish()
            }
        }
    }
}
