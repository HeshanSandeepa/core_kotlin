package control_flow


fun demoDoWhile() {
    var total = 0
    var step = 0

    do {
        total += step
        step += 1
    } while (total < 5)

    println(total)
}

fun main(args: Array<String>) {

    // for
    val cakes = listOf("Cake", "Pudding", "Rice")
    cakes.forEach {
        println(it)
    }

    // do-while
    demoDoWhile()
}

