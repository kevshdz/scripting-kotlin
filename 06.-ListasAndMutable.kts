
//Listas inmutables
//val lista = listOf("A", "B", "C")
//Listas Mutables
val lista = mutableListOf("A", "B")
//lista.add("C")
//Se comporta de la misma manera que una mutable list
val lista = ArrayList<String>()
//lista.add("X")

//Arreglos 
val arreglo = arrayOf("Uno", "Dos", "Tres")
arreglo[1] = "Nuevo"

val enteros = intArrayOf(1, 2, 3)
val decimales = doubleArrayOf(1.0, 2.0)
//val nombres = stringArrayOf("Kevin","Ceci")

val vacia: List<String> = emptyList()
val mutableVacia = mutableListOf<String>()


val listaDinamica = List(10){
    println(it)
}

