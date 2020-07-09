package functional

/**
 * - Lambda functions - simpleway to create functions ad-hoc.
 * - Lambdas can be denoted very concisely using type inference and the implicit 'it' variable
 * **/

fun main() {
    /** lambda is the part in curly braces, which is assigned to a variable of type (String)->String (a function type) **/
    val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}

    /** Type inference inside lambda: the type of the lambda parameter is inferred from the type of the variable it's assigned to **/
    val upperCase2: (String) -> String = {str -> str.toUpperCase()} // str - variable assumes string from parameter

    /** Type inference outside lambda: the type of the variable is inferred from the type of the lambda parameter and return value **/
    val upperCase3 = {str: String -> str.toUpperCase()} // str - variable is defined as String

    /** Cannot do both together. The compiler has no change to infer the type that way **/
//    val upperCase4 = {str -> str.toUpperCase()}

    /** For lambda single parameter: no need to explicitly name it. Just use implicit 'it'. useful when the type of 'it' can be inferred **/
    val upperCase5: (String) -> String = {it.toUpperCase()}

    /** lambda with single function call (use :: ) **/
    val upperCase6: (String) -> String = String::toUpperCase

    println(upperCase2("hello"))
    println(upperCase1("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}