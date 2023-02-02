package control_flow






fun main(args: Array<String>) {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // structural comparison
    println(authors === writers) // reference comparison
}

