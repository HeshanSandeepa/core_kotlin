package classess

// let you restrict the use of inheritance.
// Once you declare a class sealed, it can only be subclassed from inside the same package where the sealed class is declared.
// It cannot be subclassed outside the package where the sealed class is declared.


sealed class Mamal(val name: String)

class Cat(val catName: String): Mamal(catName)
class Human(val humanName: String, val job: String): Mamal(humanName)

fun greetMamal(mamal: Mamal): String {
    when (mamal) {
        is Human -> return "Hello ${mamal.humanName}"
        is Cat -> return "Hello ${mamal.catName}"
    }
}

fun main(args: Array<String>) {

    print(greetMamal(Cat(catName = "Kitty")))

}
