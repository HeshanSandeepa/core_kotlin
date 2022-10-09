package basic


fun demonstrateRanges() {

    // in
    val a = 5
    if (a in 1..a+8) {
        println("a fits in the range")
    }

    // iterate over a range
    for(x in 1..5) {
        println(x)
    }

    // iterate over a range - progression
    for(x in 1..5 step 2) {
        println(x)
    }


}



fun main() {
    demonstrateRanges()
}