package com.example.reto

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_camara.*
import org.jetbrains.anko.toast

const val REQUEST_IMAGE_CAPTURE = 6
class CamaraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camara)
    }

    override fun onStart() {
        super.onStart()
        flash.setOnClickListener {
            DisparoIntent()
        }
            toast("Pulse en foto para activar la camara")

    }


    private fun DisparoIntent() {

        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->

            takePictureIntent.resolveActivity(packageManager)?.also {

                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)

            }

        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imagenBit = data!!.extras!!.get("data") as Bitmap

            image.setImageBitmap(imagenBit )

        }

    }
}



