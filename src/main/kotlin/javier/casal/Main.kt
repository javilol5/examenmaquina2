package javier.casal

    fun main() {

        println("========================================")
        println("          ASCENSOR-HALO CASAL           ")
        println("========================================")

        println("\n1-  Idle")
        println("Estado: ${estado_actual.aTexto()}, Nivel actual: $nivel_actual")

        println("\n2-  Bajando")
        nivel_0 = true
        gestor()
        println("Estado: ${estado_actual.aTexto()}, Nivel actual: $nivel_actual")
        gestor()
        println("Estado: ${estado_actual.aTexto()}, Nivel actual: $nivel_actual")
        nivel_0 = false

        println("\n3-  Subiendo")
        nivel_1 = true
        gestor()
        println("Estado: ${estado_actual.aTexto()}, Nivel actual: $nivel_actual")
        gestor()
        println("Estado: ${estado_actual.aTexto()}, Nivel actual: $nivel_actual")
        nivel_1 = false

        println("\n4-  Error")
        fallo = true
        gestor()
        println("Estado: ${estado_actual.aTexto()}, Nivel actual: $nivel_actual")
        fallo = false

    }