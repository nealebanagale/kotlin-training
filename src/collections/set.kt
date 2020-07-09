package collections

/**
 * - An unordered collection that doest not support duplicates
 * - setOf() and mutableSetOf()
 * - A read-only view of a mutable set can be obtained by casting it to Set
 * **/

/** Element to the Set **/
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String) : Boolean {
    return openIssues.add(uniqueDesc) //returns boolean value if the element wat actually added
}

fun getStatusLog(isAdded: Boolean): String {
    return if(isAdded) "Registered correctly." else "marked as duplicate and reject"
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}