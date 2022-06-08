enum class Type{
    NOOB, PRO;

    fun makeReadable() = name.toLowerCase().replaceFirstChar { it.uppercase() }
}

object SingletonClass{
    fun sayHi(type: Type){
        val name = when(type){
            Type.NOOB -> type.makeReadable()
            Type.PRO -> type.makeReadable()
        }
        println("hi, $name")
    }
}

fun main(){
    //val test = SingletonClass()
    //test.sayHi()
    //output:
    //ERROR!

    SingletonClass.sayHi(Type.NOOB)
    //output:
    //hi, Noob 
}