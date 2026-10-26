package javier.casal

sealed class Estados {
    object Idle : Estados()
    object MovingUP : Estados()
    object MovingDOWN : Estados()
    object Error : Estados()
}