package control_flow

/**
 * - Kotlin uses '==' for structural comparison (also called equality - two object contain the same state). Two objects have equivalent content or .equals() method
 * - '===' for referential comparison (also called identity - whether two objects share the same memory address). Two objects are the same
 * **/

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    /** calls authors.equals(writers) - returns true **/
    println(authors == writers)

    /** authors and writers are distinct references - returns false **/
    println(authors === writers)
}