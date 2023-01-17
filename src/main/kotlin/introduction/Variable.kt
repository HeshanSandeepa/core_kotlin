package introduction


fun main(args: Array<String>) {

    // You're free to choose when you initialize a variable, however, it must be initialized before the first read.
    val name: String?
    name = null
    println(name)


    val age: Int
    if (false) {
        age = 20
    } else {
        age = 52
    }
    println(age)


}