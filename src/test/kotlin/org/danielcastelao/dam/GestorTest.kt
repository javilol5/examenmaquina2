package javier.casal

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GestorTest {
    @BeforeTest
    fun setUp() {
        estado_actual = Estados.Idle
        nivel_actual = 0
        nivel_destino = 0
        fallo = false
        nivel_0 = false
        nivel_1 = false
    }

    @Test
    fun `gestor establece el nivel de error cuando el estado es Error`() {
        estado_actual = Estados.Error
        nivel_actual = 5

        assertEquals(-1, gestor())
        assertEquals(-1, nivel_actual)
    }
}