package special_classes

/**
 * - Data classes make it easy to create classes that are used to store values
 * - automatically provided with methods for copying, getting a string representation, and using instances in collections
 * **/

/** Defines a data class with the 'data' modifier **/
data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    /** toString method is auto-generated, which makes prinln output look nice **/
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    /** auto-generated equals considers two instances equal if all their properties are equal **/
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    /** Equal data class instances have equal hashCode() **/
    println(user.hashCode())
    println(thirdUser.hashCode())
    println(secondUser.hashCode())

    /** Auto-generated copy function makes it easy to create a new instance **/
    println(user.copy())

    /** When copying, you can change values of certain properties. Copy accepts arguments in the same order as the class constructor **/
    println(user.copy("Max"))

    /** Use copy with named arguments to change the value despite of the properties order **/
    println(user.copy(id = 2))

    /** auto-generated 'componentN' functions let you get the values of properties in the order of declaration **/
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")



}