package classes
/**
 * - class name, class header, class body, surrounded by curly braces
 * - header and the body are optional
 * - if class has no body, curly braces can be omitted
 * **/

/** class declaration w/o any properties or user-defined constructors (non-parameterized is default by Kotlin)  **/
class Customer

/** class declaration with two properties(id & email) and a constructor with two parameters (getters/setters for id & email) **/
class Contact(val id: Int, var email: String)

fun main() {
    /** Creates instance of customer via the default constructor (no 'new' wkeyword in Kotlin  **/
    val customer = Customer()

    /** Creates instance of Contact using the constructor with two args **/
    val contact = Contact(1, "neale@gmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "alyssa@gmail.com"
    println(contact.email)
}