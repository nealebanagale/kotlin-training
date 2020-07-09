package special_classes

/**
 * - used to model types that represent a finite set of distinct values such as directions, states, modes, and so forth
 * **/

/**  Defines a simple enum class with three enum instances. The number of instances is always finite and they are all distinct **/
enum class State {
    IDLE, RUNNING, FINISHED
}

/** Defines an enum class with a property and a method **/
enum class Color(val rgb: Int) {
    /** Each instance must pass an argument for the constructor parameter **/
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00); //semicolon

    /** enum class members are separated from the instance of definition by semicolon **/
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    /** access the enum instance via the class name **/
    val state = State.RUNNING

    /** enum can infer with a when expression (when is exhaustive so that you don't need the else case) **/
    val message = when (state) {
        State.IDLE      -> "It's idle"
        State.RUNNING   -> "It's running"
        State.FINISHED  -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)                        //default soString returns the name of the instance
    println(red.containsRed())          //calls a method on an enum instance
    println(Color.BLUE.containsRed())   //calls a method via enum class name
}