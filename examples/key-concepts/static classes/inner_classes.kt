public class Outer(){
    private val hi : String = "default hi"
    inner class Writer(val s: String = hi){
        val hello: String = s
        fun sayHi(): Boolean{
            return hello == "default hi"
        }
    }
    
} 

fun main(){
    //Outer.Writer().sayHi() gives error!
    //With using *inner* keyword, inner classes can access outer members too!
    println(Outer().Writer().sayHi())
}