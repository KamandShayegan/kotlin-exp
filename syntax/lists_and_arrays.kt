//..........................
val movies = mutableListOf("Matrix", "Alice In Wonderland", "Noah")
val fruits = listOf("apple", "orange", "banana", "kiwi") //immutable
var food = listOf("pork", "beef") //still immutable
val drink = arrayOf("OJ", "Chocolate milk") //can change values, not size
//..........................


fun main(){

    movies.add("Malena")
    //..........................

    //fruits.add("blueberries") 
    //output: ERROR
    //..........................
    
    //food.add("chicken") 
    //output: ERROR
    //..........................
    
    drink[1] = "Latte"
    //..........................

    println(movies)
    //output: 
    //[Matrix, Alice In Wonderland, Noah, Malena]
    //..........................

    println(drink[1])
    //output:
    //Latte
    //..........................

    movies.forEach{ element -> 
        println("movie: $element")
    }
    //output: 
    //movie: Matrix
    //movie: Alice In Wonderland
    //movie: Noah
    //movie: Malena
    //..........................
}


