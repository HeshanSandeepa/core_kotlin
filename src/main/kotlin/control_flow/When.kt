package control_flow



fun getState(number: Int): String {
    return when (number) {
        1 -> "One"
        10 -> "Two"
        else -> "Invalid"
    }
}

fun getStateAny(obj: Any): Any {
    return when (obj) {
        1 -> "One"
        "10" -> "Two"
        else -> "Invalid"
    }
}


fun main(args: Array<String>) {

    println(getState(50))
    println(getStateAny("10"))
}

