package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numeroLadosDado: Int = 100
        val textViewNumeroLadosDado: TextView = findViewById(R.id.textViewNumeroLadosDado)
        textViewNumeroLadosDado.text = "Dado de ${numeroLadosDado} Lados"

        val botaoRolarDado: Button = findViewById(R.id.botaoRolarDado)
        botaoRolarDado.setOnClickListener {

            val textViewResultadoRolagem: TextView = findViewById(R.id.textViewResultadoRolagem)
            textViewResultadoRolagem.text = (1..numeroLadosDado)
                .random()
                .toString()
        }
    }
}