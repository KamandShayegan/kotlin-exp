class Outer(){
    companion object{
        private val hi = "hi"
        fun sayHi() : Boolean{
            return hi == "say hi"
        }

    }
}

fun main(){
    //Outer().sayHi() gives error
    println(Outer.sayHi())
}