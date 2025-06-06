// El factorial es el resultado de la multiplicación de un numero entero positivo
//Ejemplo 5 
//Factorial seria: 
//5 * 4 = 20
//20 * 3 = 60
//60 * 2 = 120
//120 * 1 = 120


fun factorialNumero(number:Int):Int{
    return if(number <= 1){
        1
    }else{
        println(number)
        number * factorialNumero(number - 1)
        
    }
}
println(factorialNumero(4))

fun restaData(number:Int):Int{
    return if(number > 0){
        println(number)
        restaData(number - 1)
        
    }else{
        6
    }
}

restaData(4)