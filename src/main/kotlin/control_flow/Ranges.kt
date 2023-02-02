package control_flow



fun main(args: Array<String>) {

    for (i in 0..3) {
        println(i)
    }

    for (i in 0 until 3) {
        println(i)
    }

    for (i in 0..5 step 2) {
        println(i)
    }

    for (i in 10 downTo 5) {
        println(i)
    }

    for(i in 'a'..'w') {
        print(i)
    }

    for (i in 'a'..'z' step 5) {
        print(i)
    }

}

