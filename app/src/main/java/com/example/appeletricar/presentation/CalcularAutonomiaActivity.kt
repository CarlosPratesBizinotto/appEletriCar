package com.example.appeletricar.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appeletricar.R

class CalcularAutonomiaActivity : AppCompatActivity() {
    lateinit var precokwh: EditText
    lateinit var kmpercorrido: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListenrs()

    }
    //Recuperar os campos da ActivityMain
    fun setupView(){
        kmpercorrido = findViewById(R.id.et_km_percorrido)
        precokwh = findViewById(R.id.et_preco_kwh)
        resultado = findViewById(R.id.et_resultadokmpreco)
        btnCalcular = findViewById(R.id.btn_calcular)
    }



    fun setupListenrs() {
        btnCalcular.setOnClickListener {
        if (calcular() == null)
            println("Coloque os valores")
        else
            calcular()
        }
}

    fun calcular() {
        val preco = precokwh.text.toString().toFloat()
        val km = kmpercorrido.text.toString().toFloat()

        val result = preco / km

        resultado.text = result.toString()
        //Log.d("Texto digitado ->", preco.toString())
        //Log.d("Texto digitado ->", km.toString())
        //Log.d("Resultado Media ->", resultado.toString())
    }

}