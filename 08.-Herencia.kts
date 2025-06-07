// Se ocupa open para poder heredar a otras clases
open class Motor(val vehiculo: String) {
    open fun encendido() {
        println("$vehiculo Encendido.")
    }
}

class Auto(vehiculo: String) : Motor(vehiculo) {
    override fun encendido() {
        println("$vehiculo Encendido")
    }
}

class Moto(vehiculo: String) : Motor(vehiculo) {
    override fun encendido() {
        println("$vehiculo Encendido")
    }
}


val miMoto = Moto("Moto")
val miCarro = Auto("Auto")

miPerro.encendido() 
miGato.encendido() 