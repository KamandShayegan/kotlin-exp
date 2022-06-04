
class Animal(val name: String, val color: String){
    init{
        println("First to be printed")
    }
    
    fun check(){
        println("The animal is called $name and it's $color")
    }
    
    //Secondary Constructor:
    constructor() : this("ant", "black"){
        println("$color $name")
    }

}

fun main(){
    //instantiation:
    val animal = Animal("Zebra", "Black and White")
    println(animal.name)
    println(animal.color)
    animal.check()
    //output:
    // First to be printed
    // Zebra
    // Black and White
    // The animal is called Zebra and it's Black and White
    

    //calling secondary constructor:
    val animal2 = Animal()
    println(animal2.name)
    println(animal2.color)
    //output:
    // First to be printed
    // black ant
    // ant
    // black

}