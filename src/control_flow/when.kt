package control_flow

/**
 * When Statement
 * - instead of the widely used switch statement
 * - more flexible and clear
 * - can be used either as a statement or as an expression
 * **/

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}
class MyClass

/** When Statement **/
fun cases(obj: Any) {
    when (obj) {
        1           -> println("One")               // = 1
        "Hello"     -> println("Greeting")          // = "Hello"
        is Long     -> println("Long")              //type checking
        !is String  -> println("Not a string")      //inverse type checking
        else        -> println("Unknown")           //the default statement (can be omitted)
    }
}

/** When Expression **/
fun whenAssign(obj: Any) : Any {
    val result = when (obj) {
        1       -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

