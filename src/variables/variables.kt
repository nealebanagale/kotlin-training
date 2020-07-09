package variables

fun main() {
    //mutable variable and initializing it
    var a: String = "initial"
    println(a)

    //immutable variable and initializing it
    val b: Int = 1
    println(b)

    //immutable variable and initializing w/o specifying the type
    val c = 3
    println(c)

    //declares a variable without initialization
    var e: Int
    // println(e) //will produce compiler error: Variable 'e' must be initialized

    val d: Int

    if(false) {
        d = 1
    } else {
        d = 2
    }
    println(d)

}