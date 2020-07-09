package control_flow

/**
 * Commonly used loops: for, while, do-while
 * **/

fun main() {
    val cakes = listOf("carrot", "cheese", "chocolate")     //listOf -  list of given elements. list is serializable

    /** FOR **/
    for (cake in cakes) {
        println("Yummy, its a $cake cake")
    }
    var cakesEaten = 0
    var cakesBaked = 0

    /** WHILE (executes code block while the condition is true) **/
    while (cakesEaten < 5 ) {
        eatCake()
        cakesEaten ++
    }

    //do-while (block then checking the condition)
    /** DO-WHILE (executes code block while the condition is true) **/
    do {
        bakeCake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    //Iterators
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) {
        println("Watch out, its a ${animal.name}")
    }
}

fun eatCake() = println("Eat a cake")
fun bakeCake() = println("Bake a cake")

class Animal(val name: String)
class Zoo(val animals: List<Animal>) {
    /** Iterator function - (1) must be named 'iterator' and (2) have the 'operator; modifier  **/
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()   //returns iterator object next(): Animal and hasNext(): Boolean
    }
}