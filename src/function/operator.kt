package function

fun main() {
    /**
     * Operator Functions
     *  - certain functions can be "upgraded" to operators
     *  - allowing their calls with the corresponding operator symbol
     * **/
    //operator symbol for times() is *
    operator fun Int.times(str: String) = str.repeat(this)
    println (2 * "Yeah ")

    //operator function allows easy range access on strings
    //get() operator enables bracket-access syntax (indexed access operator)
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
    println(str[0..14])
}