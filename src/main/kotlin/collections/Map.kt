package collections

// Map is a collection of key value pairs
// Key is unique

fun main(args: Array<String>) {

    val mutableMap = mutableMapOf(1 to 20, 2 to 22, 3 to 23) // mutableMapOf(Pair(1, 20), Pair(2, 22), Pair(3, 23))
    val map: Map<Int, Int> = mutableMap

    println(map.containsKey(2))
    println(map[3])



}

