package basic

// for loop
fun forLoop() {
    val items = listOf("Toyota", "Nissan", "Mitsubishi")
    // foreach loop
    for (item in items) {
        println(item)
    }
    //for with index
    for (index in items.indices) {
        println("The item in $index of items is ${items[index]}")
    }
}

fun whileLoop() {

    var count = 0
    val items = listOf("Toyota", "Nissan", "Mitsubishi")
    while (count < items.size) {
        println(items[count])
        count += 1
    }
}


fun main() {
    //forLoop()
    whileLoop()
}