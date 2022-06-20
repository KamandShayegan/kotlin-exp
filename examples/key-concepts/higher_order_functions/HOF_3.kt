fun operation() : (Int)-> Int{
    return ::square
}
fun square(x: Int) = x*x


fun main(){
    val function : (Int)->Int = operation()
    println(function(2))
}