package special_classes

/**
 * - Seal classes let you restrict the use of inheritance
 * - once you declared a class sealed, it can only be subclassed from inside the same file where the sealed class is declared
 * - it cannot be subclassed outside of the file where the sealed class is declared
 * **/

/** Defines a sealed class **/
sealed class Mammal(val name: String)

/** defined subclasses. NOTE: All subclasses must be in the same file **/
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) : String {
    when (mammal) {     //uses an instance of the sealed class as an argument in a when expression
        //smartcast is performed for casting Mammal to Human and Cat
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Neale", "IT")))
}