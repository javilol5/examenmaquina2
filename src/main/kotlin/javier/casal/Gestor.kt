package javier.casal

// nivel en el que se encuentra el ascensor
var nivel_actual: Int = 0
// estado actual del ascensor
var estado_actual: Estados = Estados.Idle

var nivel_destino : Int = 0
var fallo: Boolean = false
var nivel_0: Boolean = false
var nivel_1: Boolean = false

/**
 * Gestiona el cambio de estados
 */
fun gestor(): Int {
    when (estado_actual) {
        is Estados.Idle -> {
            nivel_actual = 0
            return nivel_actual
        }
        is Estados.MovingUP -> {
            nivel_actual = 2
            return nivel_actual
        }
        is Estados.MovingDOWN -> {
            nivel_actual = 2
            return nivel_actual
        }
        is Estados.Error -> {
            nivel_actual = -1
            return nivel_actual
        }
    }
}

fun gestionarIdle() {
    if (fallo) {
        estado_actual = Estados.Error
        nivel_actual = -1   //numero de error
        return
    }

    if (nivel_actual == 0 && (nivel_1 || nivel_destino == 1)) {
        estado_actual = Estados.MovingUP
    }   else if (nivel_actual == 1 && (nivel_0 || nivel_destino == 0)) {
        estado_actual = Estados.MovingDOWN
    }

}


fun gestionarMovingUp() {
    if (fallo) {
        estado_actual = Estados.Error
        nivel_actual = -1
        return
    }
    nivel_actual == 2
    estado_actual = Estados.Idle
    nivel_actual = 1
}

fun gestionarMovingDown() {
    if (fallo) {
        estado_actual = Estados.Error
        nivel_actual = -1
        return
    }
    nivel_actual == 2
    estado_actual = Estados.Idle
    nivel_actual = 0
}

fun gestionarError() {
    estado_actual = Estados.Error
    nivel_actual = -1
}

//to_string
fun Estados.aTexto(): String {
    return when (this) {
        is Estados.Idle -> "Idle"
        is Estados.MovingUP -> "MovingUP"
        is Estados.MovingDOWN -> "MovingDOWN"
        is Estados.Error -> "Error"
    }
}