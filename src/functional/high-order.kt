package functional

/**
 * - higher-order function is a function t hat takes another function as parameter and/or returns a function.
 * **/


/** Declares a higher-order function. Takes two integer parameters.
 * Additionally takes another function (operation) as a parameter
 * operation parameters and return type are also defined (Int, Int) -> Int)
 * **/
fun calculate (x: Int, y: Int, operation:(Int, Int) -> Int) : Int {
    /** higher-order function returns the result of operation invocation **/
    return operation(x,y)
}

/** Declares a function that matches the operation signature **/
fun sum(x: Int, y: Int) = x + y


/** Higher-order function that returns a function **/
fun operation(): (Int) -> Int {
    return ::square
}

/** Declares a function matching the signature **/
fun square(x: Int) = x * x

fun add(x: Int) =  x + x

fun main() {
    /** Taking Functions as Parameters **/
    /** Invokes the higher-order function passing two integer values and the function argument ::sum **/
    val sumResult = calculate(4, 5, ::sum)  //:: - the notation that references a function by name in Kotlin
    val mulResult = calculate(4,5) {a, b -> a * b} //lambda as a function argument
    println("sumResult: $sumResult, mulResult: $mulResult")

    /** Returning Functions **/
    /** Invokes operation to get the result assigned to a variable. func becomes square which was returned by operation() **/
    val func = operation()
    /** Invokes func. The square() function is actually executed **/
    println(func(3))

}