package collections



fun main(args: Array<String>) {

    val list = listOf(1,5,6,9,8,2,4,5,4,5,8,)
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    // any, return true, if any value matched the condition
    val anyOdd = list.any { it % 2 == 1 }
    println(anyOdd)

    // all, return true, if all elements matched the condition
    val allArePositive = list.all { it > 0 }
    println(allArePositive)

    // none, returns true, if no element matches the condition
    val nonMatched = list.none { it > 100 }
    println(nonMatched)

    // find first, returns the first, that the condition is matched
    val elementsWithSome = words.find { it.startsWith("some") }
    println(elementsWithSome)

    // finds last, returns the last, that the condition is matched
    val lastElementWithSome = words.findLast { it.startsWith("some") }
    println(lastElementWithSome)

    // first
    println(words.first())
    println(words.first{ it.startsWith("some")})

    // last
    println(words.last())
    println(words.last{ it.startsWith("some")})

    // count
    println(list.count())
    println(list.count { it > 8 })




}

