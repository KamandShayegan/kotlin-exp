fun main(){
    // val op1 = { "$it is such a beautiful day"} GIVES ERROR!
    val op1 = { it:String -> "$it is such a beautiful day"}

    println(op1("hi it"))
    //output: hi it is such a beautiful day

}