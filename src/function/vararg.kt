package function

fun main() {
    /**
     * - varargs allow you to pass any number of arguments by separating them with commas
     ***/

    //vararg modifier turns a parameter into a vararg
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Bes", "I", "ever", "had")

    //add another parameter of the same type after the vararg (named parameters)
    fun printAllWithPrefix(vararg messages: String, prefix: String, suffix: String) {
        for (m in messages) println(prefix + m + suffix)
    }
    //using named parameter you can sett value to prefix & suffix separately from the vararg
    printAllWithPrefix(
        "Bes", "I", "ever", "had",
        prefix = "Paraluman: ",
        suffix = " !"
    )

    //vararg is just an array at runtime
    fun log(vararg entries: String) {
        printAll(*entries)  // * - special spread operator
    }
    log("Houston", "Minnesota", "Atlanta")
}



