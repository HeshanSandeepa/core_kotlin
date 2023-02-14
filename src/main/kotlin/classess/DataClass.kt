package classess



// this makes easy to create classes that used to store values ( typically models )
// provides in built featured to copying, getting a string representation etc



data class User(val name: String) {

   // override fun equals(other: Any?) = other is User && other.name == this.name

    override fun toString() = name
}

fun main(args: Array<String>) {

    val user  = User("UserOne")
    val user2  = User("UserOne")

    println( user.toString())

    if (user == user2){
        println("equal")
    } else {
        println("Not eqail")
    }

    println(user.hashCode())
    println(user2.hashCode())


}
