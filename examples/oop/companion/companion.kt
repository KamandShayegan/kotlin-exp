class Entity private constructor(val id : Int){

    companion object Factory {
        const val id : Int = 123
        fun create() : Entity{
            println("Entity with id = $id is created")
            return Entity(id)
        } 
    }

}

fun main(){
    Entity.create()
}