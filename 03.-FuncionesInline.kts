inline fun medirTiempo(bloque: () -> Unit) {
    val inicio = System.currentTimeMillis()
    bloque()
    println("Tiempo: ${System.currentTimeMillis() - inicio} ms")
}

inline fun verificarPermiso(tienePermiso: Boolean, siTiene: () -> Unit, siNoTiene: () -> Unit) {
    if (tienePermiso) {
        siTiene()
    } else {
        siNoTiene()
    }
}

fun main() {
    medirTiempo {
        for (i in 1..1_000_000) {
            val x = i * i
        }
    }
     verificarPermiso(false,
        siTiene = { println("Puedes acceder al sistema") },
        siNoTiene = { println("Acceso denegado") }
    )
}
main()