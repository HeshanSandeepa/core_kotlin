package introduction


fun main(args: Array<String>) {

    var name: String = "this is string"
    //name = null // wont compile

    var nullableName: String?
    nullableName = null
    //println(nullableName)

    printName("null not")
}

fun printName(name: String?) {
    name?.let {
        println(name)
    }
}