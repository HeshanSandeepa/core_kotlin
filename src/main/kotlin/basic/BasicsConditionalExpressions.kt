package basic

// if
fun isMaxFunction(a: Int, b: Int): Boolean  {
    return a < b
}
// if as an expression
fun isMax( a: Int,  b: Int) = a < b

// when expression, similar to switch statement
fun describes(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun main() {
    println(isMaxFunction(41,45))
    println(isMax(35,6))

    println(describes("Hello"))

    for (x in 1..10 step 2) {
        print(x)
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}