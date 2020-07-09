package variables

fun main() {
    /** declares a non-null string value **/
    var neverNull: String = "This can'tt be null"
    // neverNull = null - compilation error when assigning null to a non-nullable variable

    var nullable: String? = "You can null me"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null - compilation error, assumes the variable is non-nullable

    /** function with a non-null string parameter **/
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull))
    //strLength(nullable) - compilation error because of nullable argument passed

    /** function that takes in a nullable string **/
    fun describeString(maybeString: String?): String {
        if(maybeString !== null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "mpty or null string"
        }
    }

    println(describeString(neverNull))
    println(describeString(nullable))
}