interface InternalLog{
    val msg : String
    fun printMsg(){
        println("no cause: $msg")
    }
    fun printMsgWithCause(person : Person){
        println("$msg (cause of action: ${person.name})")
    }
}

interface ExternalLog{
    fun exPrintMsg(cause : String){
        println("sth is wrong with the: $cause")
    }
}

class Person(val name : String = "Kamand"){
    init{
        println("$name has started playing")
    }

}

open class Log(val message : String = "no log") : InternalLog, ExternalLog{
    override val msg : String
        get () = message
    override fun printMsgWithCause(person: Person){
        super.printMsgWithCause(person)
        println("extra print")
    }
    override fun exPrintMsg(cause: String){
        super.exPrintMsg(cause)
    }

}
//..........................
class FancyLog : Log(){
    fun fancyLog(){
        println("this is a fancy log")
    }
}
//..........................



fun main(){
    val l1 = Log()
    println(l1.msg)
    //output:
    //no log

    val l2 = Log(message = "error has occured")
    println(l2.msg)
    //output:
    //error has occured

    val l3 = Log(message = "Bishop is broken")
    val person = Person(name = "Sarah")
    l3.printMsgWithCause(person)
    //output:
    // Sarah has started playing
    // Bishop is broken (cause of action: Sarah)
    // extra print

    val l4 = Log("Queen can't move right now")
    l4.exPrintMsg(cause = "hardware")
    //output:
    //sth is wrong with the: hardware

    val l5 = Log()
    val checkType : String = if(l5 is ExternalLog) "same type" else "dif types"
    println(checkType)
    //output:
    //same type

    val checkType2 : String = if(l5 is InternalLog) "same type" else "dif types"
    println(checkType2)
    //output:
    //same type

    val fancyLog = FancyLog()
    fancyLog.fancyLog()

}


