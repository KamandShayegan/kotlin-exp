//..........................
val names = mapOf(1 to "Sara", 2 to "Omid", 3 to "Kasra", 4 to "Kamand") //immutable map
val mutableNames = mutableMapOf(1 to "Sara", 2 to "Omid", 3 to "Kasra", 4 to "Kamand")
//..........................


fun main(){

    //names.put(4 to "Asghar") 
    //output: ERROR
    mutableNames.put(4, "Asghar") 
    //..........................

    print("$names \n") //equivalent to println
    //output:
    // {1=Sara, 2=Omid, 3=Kasra, 4=Kamand}
    //..........................

    names.forEach { _, v ->
        if(v.length>4){
            println(v)
        }else{
            println("name is too short")
        }
    }
    //output:
    //name is too short
    //name is too short
    //Kasra
    //Kamand
    //..........................
}

