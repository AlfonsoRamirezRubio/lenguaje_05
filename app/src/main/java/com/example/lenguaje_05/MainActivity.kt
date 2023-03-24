package com.example.lenguaje_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var txtTitulo: TextView
    lateinit var txtCaracteristica: TextView
    lateinit var  spLenguajes: Spinner
    var lenguajes = arrayOf("Java","Kotlin","PHP","SWIFT","C#","c++", "Dart","JS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTitulo = findViewById(R.id.txtTitulo)
        txtCaracteristica = findViewById(R.id.txtCaracteristica)
        spLenguajes = findViewById(R.id.spLenguajes)

        val adaptador = ArraysAdapter(android.R.layout.simple_spinner_item, lenguajes)

        adaptador.setDropDownViewResource(android.layaout.simple_spiner_dropdown_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener = this
    }
    override fun  onItemSelected(p0:AdapterView<*>,p1: View?,posicion: Int, p3:Long){
        val valorSeleccionado = lenguajes [posicion]
        Toast.makeText(this, "seleccionado $valorSeleccionado", Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(p0:AdapterView<*>?){

    }


    }

