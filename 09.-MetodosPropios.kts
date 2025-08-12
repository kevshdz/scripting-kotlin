fun main() {
    println("Metodos Propios En Listas Kotlin")
    println("sort")
    sortExample()
    println("sortBy")
    println("filter")
    println("filterIndexed")
    println("GroupBy")
    println("Plus")
    println("Distinct")
}


fun sortExample() {
    val numeros = mutableListOf(0,20,38,371,1)
    println("Lista Original: $numeros")
    numeros.sort()
    println("Lista Ascendente: $numeros")
    numeros.sortDescending()
    println("Lista Desendente: $numeros")
    sortByExample()
}

fun sortByExample(){
    data class Carro(val marca:String, val modelo:String, val año:Int)
    val autos = mutableListOf(
        Carro("Volkswagen","Jetta",2023),
        Carro("Nissa","Versa",2015),
        Carro("Chevrolet","Onix",2024)
    )
    println("Lista Original $autos")
    autos.sortBy{ it.año }
    println("Ordenada por año: $autos")
    autos.sortBy{ it.marca }
    println("Ordenada por Marca: $autos")
    autos.sortBy{ it.modelo }
    println("Ordenada por Modelo: $autos")

}

main()
