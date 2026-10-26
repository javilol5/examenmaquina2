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

    @Test
    fun `test Idle-MovingUP por nivel_1`() {
        estado_actual = Estados.Idle
        nivel_actual = 0
        nivel_1 = true

        gestor()

        assertEquals(Estados.MovingUP, estado_actual)
    }

    @Test
    fun `test Idle-MovingUP por nivel_destino 1`() {
        estado_actual = Estados.Idle
        nivel_actual = 0
        nivel_destino = 1

        gestor()

        assertEquals(Estados.MovingUP, estado_actual)
    }

    @Test
    fun `test completo MovingUP-Idle en nivel 1`() {
        estado_actual = Estados.MovingUP
        nivel_actual = 0

        val resultado = gestor()

        assertEquals(Estados.Idle, estado_actual)
        assertEquals(1, resultado)
        assertEquals(1, nivel_actual)
    }

    @Test
    fun `test Idle-MovingDOWN por nivel_0`() {
        estado_actual = Estados.Idle
        nivel_actual = 1
        nivel_0 = true

        gestor()

        assertEquals(Estados.MovingDOWN, estado_actual)
    }

    @Test
    fun `test Idle-MovingDOWN por nivel_destino 0`() {
        estado_actual = Estados.Idle
        nivel_actual = 1
        nivel_destino = 0

        gestor()

        assertEquals(Estados.MovingDOWN, estado_actual)
    }
}