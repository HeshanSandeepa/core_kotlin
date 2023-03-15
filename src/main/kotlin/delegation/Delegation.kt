package delegation


interface ISoundBehaviour {
    fun makeSound()
}

class MeowSound: ISoundBehaviour {
    override fun makeSound() {
        println("MeowSound !!!")
    }
}

class Cat(private val soundBehaviour: ISoundBehaviour) {
    fun makeCatSound() {
        soundBehaviour.makeSound()
    }
}

class KotlinCat: ISoundBehaviour by MeowSound() {
    override fun makeSound() {
        println("KotlinCat  MeowSound !!!")
    }
}


fun main(args: Array<String>) {
    val cat = Cat(MeowSound())
    cat.makeCatSound()

    val kotlinCat = KotlinCat()
    kotlinCat.makeSound()
}

