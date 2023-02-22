package collections

// Lists are ordered
// Mutable List
fun main(args: Array<String>) {

    val mutableUsers = mutableListOf(1,5,8,9)
    val users = listOf(13,53,83,93)

    mutableUsers.add(10)
    println(mutableUsers)

    //users.add(10) // Error
    println(users)

}

