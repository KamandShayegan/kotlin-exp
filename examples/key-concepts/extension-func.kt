sealed class Person(){
    fun readMe() : String{
        return "This is where readme is located"
    }
    data class EasyGoing(val level: Int = 0) : Person()
    data class Strict(val level: Int = 0) : Person()
    data class Introvert(val level : Int = 0) : Person()
    data class Extrovert(val level : Int = 0) : Person()
}

fun Person.SayHi(){
    println("Hi")
}

fun Person.EasyGoing.respond(){
    println("It's gonna be fine")
}

fun main(){
    val chillPerson1 = Person.EasyGoing()
    chillPerson1.respond()
    //output:
    //It's gonna be fine
}