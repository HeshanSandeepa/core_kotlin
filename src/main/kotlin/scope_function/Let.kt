package scope_function




// let
// mostly used for perform null checks on objects and variables
// can be used for run

fun modifyAndGetResultLet(value: Int?): Double? {
    val total = value?.let {
        println("This is the value $it")
        val subTotal = it + (it * 0.2)
        println("This is subTotal $subTotal")
        subTotal + it
    }
    return  total
}

// run
// supports this keyword.
fun modifyAndGetResultRun(value: Int?): Double? {
    val total = value?.run {
        println("This is the value $this")
        val subTotal = this + (this * 0.2)
        println("This is subTotal $subTotal")
        subTotal + this
    }
    return  total
}

// with
// can omit the instance name when accessing its members

class Dog(name: String) {
    fun bark() {
        print("bark")
    }
}

// apply
// executes a block of code on an object and returns the object itself.
data class Dog2(var name: String, var age: Int) {
    fun bark() {
        print("bark")
    }
}

// also
// works like apply

fun main(args: Array<String>) {

    println(modifyAndGetResultLet(null))
    println(modifyAndGetResultLet(5))

    println(modifyAndGetResultRun(null))
    println(modifyAndGetResultRun(5))

    with(Dog(name = "Blacky")) {
        bark()
    }

    val secondDog = Dog2(name = "rockey", age = 10)
    val updatedDog = secondDog.apply {
        name = "Hello"
        age = 15
    }.toString()
    print(updatedDog)

    val dog = Dog(name = "rockey").also {
        println("it")
    }
    print(dog)

}

