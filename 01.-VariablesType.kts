//Date: 05/06/2025
//Title: Variables and functions In Kotlin 
//Notes: Review of knowledge in Kotlin

val name:String = "Kevin"
val last_name:String = "Hernandez"
val height:Double = 1.70
var weight:Double = 73.0
var age:Int = 28 
var isMarried:Boolean = true
val initial:Char = 'K'
//NullSafety
var distanceOrigin : Double? = null


//Functions
//Always use camelCase in declaration for functions in kotlin
fun presentation(name:String,last_name:String){
    println("Hello my name is $name my last name is $last_name")
    informationPersonal(height,weight,age,isMarried)
}

fun informationPersonal(height:Double,weight:Double, age:Int, isMarried:Boolean){
    print("Personal Information: \n")
    print("===================== \n")
    print("Weight: $height \n")
    print("Height: $weight \n")
    print("Age: $age years old \n")
    print("Is Married: $isMarried \n")
    print("From: $distanceOrigin \n")
    print("initial: $initial \n")
}

presentation(name,last_name)

//function with params optionals or for defect
fun sendEmail(ToGret:String = "Hello" , name:String = "friend", ){
    print("$ToGret $name this is a email \n")
}
sendEmail()
sendEmail("Hola", "Kevin")
sendEmail(name = "Kevin")







