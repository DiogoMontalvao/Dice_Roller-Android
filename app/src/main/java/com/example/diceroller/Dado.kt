package com.example.diceroller

class Dado(private val numeroLadosDado: Int) {

    fun rolar(): Int {
        return (1..numeroLadosDado).random()
    }
}