package control_flow

/**
 * - there is no ternary operator (condition ? then : else) in Kotlin
 * - if may be used as expression
 * **/

fun main() {
    println(max(99, -41))
}

/** if is an expression here: it returns a value **/
fun max(a: Int, b: Int) = if (a > b ) a else b