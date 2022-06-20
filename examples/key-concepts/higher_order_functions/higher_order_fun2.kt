fun calculate(x: Int, y: Int, operation: (Int,Int)->Int) : Int{
    return operation(x, y)
}

fun main(){
    var sum = calculate(3, 5){
        a, b -> a + b
    }

    var mult : Int = calculate(8, 12){
        x, y -> x*y
    }

    println(sum)
    println(mult)

}