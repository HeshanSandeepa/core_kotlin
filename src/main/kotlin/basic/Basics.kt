package basic
// basic function
fun sum(a: Int, b: Int): Int {
    return a + b;
}

// inline function
fun sumInline(a: Int, b: Int) = a + b

// unit = void function
fun unitOrVoid(): Unit {
    println("This is a void function")
}

// final / read only ( run time )
val readOnlyAge = 45

// constant
const val age = 45

// type inference
val price = 100
val total = price

// string templates
var a = 1



fun main(args: Array<String>) {
    println(sum(5,8))
    println(sumInline(5,8))
    unitOrVoid()

    //basic.getReadOnlyAge = 455 // won't work
    println(readOnlyAge)

    println(age) // compile time val

    println(total) // type of basic.getTotal is inferred here

    println("value a is $a")
}