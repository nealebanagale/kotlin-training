package classes

/***
 * Abstract classes
 * - keyword used to declare abstract classes in Kotlin
 * - no implementation in its class
 * - abstract classes are always open, need to explicitly use open keyword to inherit subclasses from them.
 * - abstract class cannot be instantiated (you cannot create objects of an abstract class)
 * - you can inherit abstract class
 */
/***
 * Abstract classes in Kotlin are similar to interface with one important difference.
 * - It's not mandatory for properties of an abstract class to be abstract or provide accessor implementations.
 */

//Abstract class
    abstract class Animal(name: String) {                // abstract class
        init {
            println("I'm an animal $name")
        }
        var breed: String = "husky"                               // non-abstract property (requires open for override)

        fun displayAnimal(name: String) {                      // non-abstract method (requires open for override)
            println("I'm a $name")
        }

        abstract fun displaySound(sound: String)    // abstract method, no implementation, must be overriden
    }

    // Subclass
    class Doggo(name: String) : Animal(name) {           // inherits abstract class (derived from Person class)
        override fun displaySound(sound: String) {      // overrides abstract method
            println(sound)
        }
    }

    fun main() {
        val husky = Doggo("Husky")                    // instantiated Teacher class, executes Person class
        husky.displaySound("Arf! Arf!")    // declared abstract
        husky.displayAnimal("Husky")
}