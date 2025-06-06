//Date: 05/06/2025
//Title: Functions In Kotlin 
//Notes: Review of knowledge in Kotlin

fun toGretAll(vararg names: String){
    for(name in names){
        println("Hello $name \n")
    }
}

fun getAges(vararg ages: Int){
    for(age in ages){
        println("Age $age years old \n")
    }
}
//Varargs with intArrayOf
toGretAll("Kevin", "Ceci", "Avril")
var intAges = intArrayOf(28,27,4)
// * pasar un array a varargs
getAges(*intAges)

//Return 
fun toGret(name:String):String{
    return name
}
//functions single expression
fun cuadrado(number:Int) = number * number
println(cuadrado(20))

fun nameUser(name:String) = name
println(nameUser("Kevin Hernandez"))

//funciones de extension
fun String.soloPrimeraLetra(): Char {
    return this.first()
}

val letra = "Hola".soloPrimeraLetra() // → 'H'

println(letra)



//funciones inline 
inline fun medirTiempo(bloque: () -> Unit) {
    val inicio = System.currentTimeMillis()
    bloque()
    println("Tiempo: ${System.currentTimeMillis() - inicio} ms")
}

//Funciones Lambda o fucniones anonimas 
val saludar = { nombre: String -> println("Hola $nombre") }
saludar("Kevin")


//Funciones locales
fun procesarDatos() {
    fun validar() {
        println("Validando...")
    }
    validar()
    println("Procesando...")
}
procesarDatos()


//Recursivas
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}


println(factorial(20))

medirTiempo{
    factorial(20)
}

//Funciones de orden mayor 
fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

val resultado = operar(2, 3) { x, y -> x + y } // resultado = 5


print(resultado)