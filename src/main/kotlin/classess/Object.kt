package classess


// object as expression
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

}

// object declaration
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

// companion objects
// Syntactically it's similar to the static methods in Java
// better to use Top Level functions for these
// https://stackoverflow.com/questions/38778882/how-to-create-package-level-functions
class BigBen {                                  //1
    companion object  {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                println("BONG ")
            }
        }
    }
}


fun main(args: Array<String>) {

    rentPrice(10, 2, 1)

    DoAuth.takeParams("foo", "qwerty")

    BigBen.getBongs(12)

}
