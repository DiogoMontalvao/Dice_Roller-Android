package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numeroLadosDado1: Int = 6
        val numeroLadosDado2: Int = 20

        val textViewTituloLadosDado1: TextView = findViewById(R.id.textViewTituloLadosDado1)
        textViewTituloLadosDado1.text = "Dado de ${numeroLadosDado1} Lados"
        val textViewTituloLadosDado2: TextView = findViewById(R.id.textViewTituloLadosDado2)
        textViewTituloLadosDado2.text = "Dado de ${numeroLadosDado2} Lados"

        val botaoRolarDado: Button = findViewById(R.id.botaoRolarDado)
        botaoRolarDado.setOnClickListener { rolarDados(numeroLadosDado1, numeroLadosDado2) }
    }

    private fun rolarDados(numeroLadosDado1: Int, numeroLadosDado2: Int) {

        fun rolarDado1(): Int {return Dado(numeroLadosDado1).rolar }
        val textViewResultadoRolagem1: TextView = findViewById(R.id.textViewResultadoRolagem1)
        textViewResultadoRolagem1.text = rolarDado1().toString()

        fun rolarDado2(): Int { return Dado(numeroLadosDado2).rolar }
        val textViewResultadoRolagem2: TextView = findViewById(R.id.textViewResultadoRolagem2)
        textViewResultadoRolagem2.text = rolarDado2().toString()
    }
}