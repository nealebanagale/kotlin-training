package functional

/**
 * - extensions mechanism - Kotlin lets you add new members to any class
 * - (1) extension function and (2) extension properties
 * - you need to specify the type that you extend
 * - possible to execute extensions on NULL references.
 * **/

/** Simple models of Item and Order. Order can contain a collection of Item objects **/
data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

/** Adds extension functions for the Order type **/
fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F      // ? THEN : ELSE sequence
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"    // ? THEN : ELSE sequence

/** NULL References **/
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

/** Adds extension property for the Order type **/
val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(listOf(
        Item("Bread",25.0F),
        Item("Wine", 29.0F),
        Item("Water",12.0F)
    ))

    /** Call extension functions directly on an instance of Order **/
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("MAx priced item value: ${order.maxPricedItemValue()}")

    /** Accesses the extension property on an instance of Order **/
    println("Items: ${order.commaDelimitedItemNames}")
}

