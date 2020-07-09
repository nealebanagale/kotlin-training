package special_classes
import java.util.Random

/**
 * - classes and objects in Kotlin work the same way as in most object-oriented languages
 * - class is a blueprint, and an object is an instance of a class
 * - usually you define a class and then create multiple instance of that class
 * - Object keyword - used to obtain a data type with a single implementation (create an object of a slight modification of some class)
 * - "single" you can think of Singleton patter: ensures you that only one instance of the class is created
 * - object: no class, no constructor, only a lazy instance - because it will be created once when the object is accessed (otherwise, it wont be created)
 * - Object Expression: simple object/properties structure, create a single object, declare its members and access it within one function
 * - Object Declaration: can't be used as variable assignment, used directly to access its members
 * - Companion Object: similar with static method in Java. You call object members using its class name as qualifier. Consider using a package-level function instead
 * **/

/** Defines a blueprint **/
class LuckDispatcher {
    /** Defines a method **/
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

/** Function with parameters **/
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    /** Object to use when calculating the result value **/
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    /** Accesses the object's properties **/
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
//    println("Total price: $$dayRates")
}

/** Object declaration **/
object DoAuth {
    /** Object method **/
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

/** Companion Object **/
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                println("BONG")
            }
        }
    }
}
class Neale {
    fun getNeale() : String {
        return "Neale"
    }
}

fun main() {
    /** Creates instance **/
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    /** Calls the method on instances **/
    d1.getNumber()
    d2.getNumber()

    /** Object Expression **/
    rentPrice(10,2,1)

    /** Object declaration **/
    DoAuth.takeParams("foo", "qwerty")

    /** Companion Object **/
    BigBen.getBongs(12)

    /*** MY TEST **/
    val neale = Neale()
    println(neale.getNeale())
}