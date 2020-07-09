package classes

/** Generics are a genericity mechanism that's become standard in modern languages. **/
/** Generic classes and functions increase code reusability by encapsulating common logic that is independent **/

/** Generic class where E is called a generic type parameter **/
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    /** E can be used as parameter like any other type **/
    fun push(element: E) = elements.add(element)

    /** E as return type **/
    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size -1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

/** generify functions if their logic is independent of a specific type.
 * For instance, you can write a utility function to create mutable stacks:
 * **/
fun <N> mutableStackOf(vararg elements: N) = MutableStack(*elements)

//util to mute varargs regardless of type (int, string)
fun <E>showMutable(vararg elements: E) = MutableStack(*elements).peek()

//fun <A>addMutable(vararg elements: A) = MutableStack(*elements).push(A)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    val peek = showMutable(0.62, 3.14, 2.7)
    println(peek)
}