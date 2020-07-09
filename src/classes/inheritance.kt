package classes

fun main() {
    //inheritance
    val dog: Dog = Yorkshire()
    dog.sayHello()

    //inheritance with parameterized constructor
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    //passing constructor arguments to superclass
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}

/** open - modifier to allow the class inheritance (Kotlin classes are final by default) **/
open class Dog {
    /** open - modifier allows overriding of methods (final by default) **/
    open fun sayHello() {
        println("arf arf!")
    }
}

/** A class (Yorkshire) inherits a superclass (Dog) when you specify ' : <superclassname()> '. The () - indicate an innovation of the superclass constructor  **/
class Yorkshire : Dog() {
    /** override - modifier to override methods or attributes **/
    override fun sayHello() {
        println("wif wif")
    }
}

/** Inheritance with parameterized constructor - just provide constructor arguments **/
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhh!")
    }
}
class SiberianTiger : Tiger("Siberia")


open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}
/** name is a constructor argument (not var or val) **/
class Asiatic(name: String) : Lion(name = name, origin = "India")
