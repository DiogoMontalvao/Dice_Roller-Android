package com.example.diceroller

class Dado(private val numeroLadosDado: Int) {
    val rolar: Int = (1..numeroLadosDado).random()
}