package introduction


class GenericStack<T>(vararg items: T) {
    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)

    fun peek() = elements.last()

    fun pop() = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}


// Generic function
fun <T>createStack(vararg items: T) = GenericStack(*items)



fun main(args: Array<String>) {

    val intStack = GenericStack<Int>(1,85,63,5,56,47)
    intStack.push(78)

    println(intStack.toString())

    intStack.peek()
    println(intStack.toString())

    intStack.pop()
    println(intStack.toString())

    println(intStack.isEmpty())

    println(intStack.size())


    println( createStack(8,8,))

}

