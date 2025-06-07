//Date: 05/06/2025
//Title: Ciclos and Coditionales 
//Notes: Review of knowledge in Kotlin


for(i in 1..10){
    println("for: $i")
}

var number:Int = 0
while(number != 10){
    println("while: $number")
    number++
    if(number == 5){
        println("if: $number")
        break
    }else{
        println("else: $number")
        continue
    }
    when(number){
        1->println(" WHEN: $number")
        else -> 
            println("Nada por aqui")
        
    }
}




