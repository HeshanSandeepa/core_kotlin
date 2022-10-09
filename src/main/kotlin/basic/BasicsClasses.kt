package basic

// classes are final by default
class Shape(val size: Int)

// for inheritance, class has to be declared as open
open class MyShape()
class Circle( val formula: Int): MyShape()



fun main() {

    val shape= Shape(10)
    println(shape.size)

    val circle = Circle(45)
    println(circle.formula)


}