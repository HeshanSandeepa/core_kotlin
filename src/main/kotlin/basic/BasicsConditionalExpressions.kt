package basic

// if
fun isMaxFunction(a: Int, b: Int): Boolean  {
    return a < b
}
// if as an expression
fun isMax( a: Int,  b: Int) = a < b

// when expression, similar to switch statement
fun whenFunction(ch: Char) {
    when(ch) {
        'A' -> println("A")
        'B' -> println("B")
        else -> println("Something else")
    }
}

fun main() {
    println(isMaxFunction(41,45))
    println(isMax(35,6))

    whenFunction('P')
}