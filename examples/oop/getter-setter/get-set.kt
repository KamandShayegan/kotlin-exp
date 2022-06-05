class Person(var name: String = "unknown", var age: Int = 0){
    init{
    println(name)
    println(age)
    }

    fun printInfo(){
        println(name)
        println(age)
    }

    fun changeName(newName: String){
        name = newName
    }

    var lastName : String? = null
        set(value){
            println("You're setting lastname: $value")
            field = value
            println("lastname is $value ")
        }

        get(){
            println("You're getting lastname")
            field = field ?: "no lastname set"
            //equevalent to:
            //field = if(field != null) field else "no lastname set"
            return field
        }

    // fun printInfo(){
    //     println("Name: $name lastname: $lastname age: $age")
    // }
}
//..........................


fun main(){
    val kamand = Person(name = "Kamand", age = 23)
    println(kamand.lastName)
    kamand.lastName = "Shayegan"
    println(kamand.lastName)
    kamand.printInfo()
    kamand.changeName(newName = "Sarah")
    println(kamand.name)
    
    //output:
    // Kamand
    // 23
    // You're getting lastname
    // no lastname set
    // You're setting lastname: Shayegan
    // lastname is Shayegan 
    // You're getting lastname
    // Shayegan
    // Kamand
    // 23
    // Sarah

}