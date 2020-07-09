package function

fun main() {
    println("Hello!")
    printMessage("From the other side")
    printMessageWithPrefix("must've called a thousand times")
    println(sum(1, 2))
    println(multiply(3, 2))
    Sample().foo() //creates instance of class function.Sample and calls foo
}

//simple function that takes a parameter of type String and returns Unit
fun printMessage(message: String): Unit {
    println(message)
}

//function that takes a second optional parameter with the default value
fun printMessageWithPrefix(message: String, prefix: String = "I") {
    println("[$prefix] $message");
}

//function that returns an integer
fun sum(x: Int, y: Int): Int {
    return x + y
}
//single expression function that returns an integer (inferred)
fun multiply(x: Int, y: Int) = x * y

//local functions - can access local variables of outer functions (i.e the closure)
fun dfs(str: String) {
    val visited = true;
    fun dfs(count: Int) {
        if (!visited) return

        dfs(1)
    }
    dfs("Hello")
}

//member function
class Sample() {
    fun foo() {print("Foo")}
}
