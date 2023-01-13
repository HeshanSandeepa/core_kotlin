package basic

// classes are final by default
class Shape(var size: Int)  {

}

// for inheritance, class has to be declared as open
open class MyShape()
class Circle( val formula: Int): MyShape() {

    fun printFormula(name: String) {

    }
}



fun main() {







//    val shape= Shape(10)
//    println(shape.size)
//
//    val circle = Circle(45)
//    println(circle.formula)


}


class Sample() {

    fun methodOne() {
        print("Methods One")
    }

    fun methodTwo( name: String) { // methd
        var newName = name
        newName = "wewjkehkw"
        print(newName)
    }
}