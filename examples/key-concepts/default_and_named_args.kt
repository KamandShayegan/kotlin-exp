val phoneBook = mutableMapOf<String, Int>("Sara" to 9123, "Amir" to 9231)
//..........................

fun addToPhoneBook(name: String = "unknown", number: Int) = phoneBook.put(name, number)
//..........................

fun main(){
    
    //addToPhoneBook(937541, "David")
    //output:
    //ERROR
    //..........................

    //addToPhoneBook(number = 937541, "David")
    //output:
    //ERROR
    //..........................

    addToPhoneBook(name = "Kamand", number = 94321)
    addToPhoneBook(number = 937541, name = "David")
    addToPhoneBook(number = 948329)
    print(phoneBook)
    //output:
    //{Sara=9123, Amir=9231, Kamand=94321, David=937541, unknown=948329}
    //..........................



}