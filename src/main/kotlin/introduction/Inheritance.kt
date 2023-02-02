package introduction


// kotlin classes are final by default
// kotlin methods also final by default
// declare them as open, in order to
open class Dog() {
    open fun bark() {
        println("baw baw")
    }
}

class Hound: Dog() {
    override fun bark() {
        println("Hound baw baw")
    }
}


// Constructor Arguments
open class Vehicle(val model: String) {
    open fun printData() {
        println("Data is : $model")
    }
}

class Car(model: String): Vehicle(model = model)

fun main(args: Array<String>) {

    val hound = Hound()
    hound.bark()

    val car = Car("Hilux")
    car.printData()
}

