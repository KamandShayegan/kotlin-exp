fun sayMyName(check :(String)->(Boolean)){
    if(check.invoke("Kamand")){
        println("names match! HI!")
    }else{
        println("names don't match")
    }
}

fun main(){
    sayMyName(){
        // (it == "Sara")
        //output:
        //names don't match
        it == "Kamand"
        //output:
        //names match! HI!
    }
}