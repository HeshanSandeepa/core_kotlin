package introduction

fun function(name: String): Unit {
    println(name)
}

fun functions(name: String, prefix: String = "Demo Prefix") {
    println("$name  $prefix")
}

fun functionOneLine(name: String) = println(name)

// Infix
// using infix , we can call functions without using . & parenthesis
infix fun Int.times(str: String) {
    println(str.repeat(this))
}
infix fun String.onto(other: String) =  Pair(this, other)

// Operator
operator  fun String.get(range: IntRange) = substring(range)

// Varargs
// allows you to pass variables separated by commas
fun printVarargs(vararg params: String) {
    for (p in params) {
        print(p)
    }
}

fun main(args: Array<String>) {

    function("Hello")
    functions("Hello")
    functionOneLine("One line")

    10 times "Me"

    println("Heshan" onto "Kotlin")

    println("25 + 25 this is sample sentence"[2..8])

    printVarargs("Hello", "Hallo", "Salut", "Hola", "你好")
}