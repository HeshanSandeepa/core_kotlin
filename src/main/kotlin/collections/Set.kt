package collections

//  Sets are un-ordered
// Sets don't support duplicates

fun main(args: Array<String>) {

    val mutableUsers = mutableSetOf(1,5,8,9)

    val isAdded = mutableUsers.add(56)
    println(isAdded)


    val isAddedAgain = mutableUsers.add(56)
    println(isAddedAgain)


    mutableUsers.forEach { println(it) }
    mutableUsers.forEach { println(it) }
    mutableUsers.forEach { println(it) }
}

