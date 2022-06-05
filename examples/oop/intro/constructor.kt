
class Animal(val name: String="Ant", val color: String="Black"){
    init{
        println("First to be printed")
    }
    
    fun check(){
        println("The animal is called $name and it's $color")
    }
    
    //Secondary Constructor: (not common)
    // constructor() : this("ant", "black"){
    //     println("$color $name")
    // }
    
    //Alternative for secondary constructors are default values in the
    //default constructor.


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
    //..........................

    //calling secondary constructor:
    val animal2 = Animal()
    println(animal2.name)
    println(animal2.color)
    animal2.check()
    //output:
    //First to be printed
    //Ant
    //Black
    //The animal is called Ant and it's Black
    //..........................
}