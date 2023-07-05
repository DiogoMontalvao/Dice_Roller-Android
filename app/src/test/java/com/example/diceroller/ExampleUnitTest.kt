package com.example.diceroller

import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun gera_numero() {
        val dado = Dado(numeroLadosDado = 6)
        val resultadoRolagem = dado.rolar()

        assertTrue("O valor não está entre 1 e 6", resultadoRolagem in 1..6)
    }
}