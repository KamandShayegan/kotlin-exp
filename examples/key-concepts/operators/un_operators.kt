data class Point(val x: Int, val y: Int)


fun main(){
    operator fun Point.not() = Point(-x, -y)
    // operator fun Point.unaryMinus() = Point(-x, -y)
    val point = Point(10, 20)
    println(!point)

}