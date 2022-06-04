
//NOT-using-vararg approach:
fun callBack(names: List<String>){
    names.forEach{ name ->
        println("YO! What's up $name?")
    }
}
//..........................

//using vararg: 
fun calcSum(vararg num:Int){
    var sum : Int = 0
    for(n in num){
        sum += n
    }
    println("Sum = $sum")
}
//..........................


fun main(){

    // callBack(arrayOf("Sara", "Mobina", "Ahmad", "Kiana"))
    //output: ERROR
    //..........................
    
    callBack(listOf("Sara", "Mobina", "Ahmad", "Kiana"))
    //output:
    // YO! What's up Sara?
    // YO! What's up Mobina?
    // YO! What's up Ahmad?
    // YO! What's up Kiana?
    //..........................
    
    calcSum(1,2,3)
    //output:
    //Sum = 6
    //..........................

    calcSum(1,2,3,4,5,6,7,8,9)
    //output:
    //Sum = 45
    //..........................

    //SPREAD operator:
    //val numbers = arrayOf(1,2,3,4,5,6,7) 
    //output: ERROR

    //val numbers = listOf(1,2,3,4,5,6,7)
    //output: ERROR

    val numbers = intArrayOf(1,2,3,4,5,6,7)

    //calcSum(numbers) 
    //output: ERROR

    calcSum(*numbers) // '*' SPREADs the elements
    //output: 
    //Sum = 28
    //..........................



}