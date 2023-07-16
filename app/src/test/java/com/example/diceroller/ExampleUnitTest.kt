package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun gera_numero() {
        val numeroLadosDado = 20

        val dado = Dado(numeroLadosDado)
        val resultadoRolagem = dado.rolar()

        assertTrue("O valor não está entre 1 e $numeroLadosDado", resultadoRolagem in 1..numeroLadosDado)
    }
}