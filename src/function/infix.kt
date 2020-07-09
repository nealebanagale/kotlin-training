package function

fun main() {
/**
 *  - infix notation (omitting the dot and the parentheses for the call)
 *  - must be member functions or extension functions;
 *  - must have a single parameter;
 *  - parameter must not accept variable number of arguments (varargs) and must have no default value.
 *  - Infix function calls have lower precedence (order of precedence) than the arithmetic operators, type casts, and the rangeTo operator
 *      1 sh1 2 + 3 is equivalent to 1 sh1 (2+3)
 *      0 until n * 2 is equivalent to 0 until (n*2)
 *      xs union ys as Set<*> is equivalent to xs union (ys as Set<*>)
 *  - infix function call's precedence is higher than that of the boolean operators && and ||, is- and in-checks, and some other operators.
 *      a && b xor c is equivalent to a && (b xor c)
 *      a xor b in c is equivalent (a xor b) in c
 *      precedence hierarchy: https://kotlinlang.org/docs/reference/grammar.html#expressions
 *
 * **/
    //infix extension function on Int
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")
    println(2.times("Yeah "))

    //creates a Pair by calling the infix function 'to' from the standard library
    val pair = "Ferrari" to "Katrina"
    println(pair)

    //implementation of 'to' creatively called in 'onto' function
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()

    //the containing class becomes the first parameter
    infix fun likes(other: Person) {likedPeople.add(other)}
}