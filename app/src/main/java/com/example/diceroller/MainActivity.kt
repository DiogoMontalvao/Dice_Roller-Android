package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numeroLadosDados: Int = 6

        val textTituloLadosDados: TextView = findViewById(R.id.textTituloLadosDado)
        textTituloLadosDados.text = "Dado de ${numeroLadosDados} Lados"

        val buttonRolarDado: Button = findViewById(R.id.buttonRolarDado)
        buttonRolarDado.setOnClickListener { rolarDados(numeroLadosDados) }
    }

    private fun rolarDados(numeroLadosDado: Int) {
        val resultadoRolagem1 = Dado(numeroLadosDado).rolar()
        val resultadoRolagem2 = Dado(numeroLadosDado).rolar()

        val textClicaBotao: TextView = findViewById(R.id.textClicaBotao)
        val imageDado1: ImageView = findViewById(R.id.imageDado)
        val imageDado2: ImageView = findViewById(R.id.imageDado2)
        val textNumeroRolado1: TextView = findViewById(R.id.textNumeroRolado)
        val textNumeroRolado2: TextView = findViewById(R.id.textNumeroRolado2)

        textClicaBotao.text = ""

        alteraTextNumeroRolado(textNumeroRolado1, resultadoRolagem1)
        alteraTextNumeroRolado(textNumeroRolado2, resultadoRolagem2)

        alteraImageDado(imageDado1, resultadoRolagem1)
        alteraImageDado(imageDado2, resultadoRolagem2)
    }

    private fun alteraImageDado(textView: ImageView, resultadoRolagem: Int) {
        val imageResourceDado = when (resultadoRolagem) {
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6
        }
        textView.setImageResource(imageResourceDado)
    }

    private fun alteraTextNumeroRolado(textView: TextView, resultadoRolagem: Int) {
        textView.text = resultadoRolagem.toString()
    }
}


