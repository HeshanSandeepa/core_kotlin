package functions


// Higher Order Functions
// Functions that takes another function as parameter or/and returns a fucntions


fun higherOrderFunctionOfTakingFunctionAsParameter(x: Int, y: Int, operation: (Int, Int) -> Int):  Int{
    return operation(x, y);
}

fun functionToBeOperation(a: Int, b: Int): Int {
    return a + b;
}


fun higherOrderFunctionOfReturningFunction(x: Int, y: Int):  (Int, Int) -> Int{
    return ::functionToBeOperation
}



fun main(args: Array<String>) {

    val anwser = higherOrderFunctionOfTakingFunctionAsParameter(10, 20, ::functionToBeOperation)
    println(anwser)

    val anwser2 = higherOrderFunctionOfReturningFunction(10, 20,)
    println(anwser)
}

