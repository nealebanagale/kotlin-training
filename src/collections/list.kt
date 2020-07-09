package collections

/** List - an ordered collection of items. It can be mutable (MutableList) or read-only (List) **/
val systemUsers: MutableList<Int> = mutableListOf(1,2,3)

/** PRevent unwanted modifications, obtain read-only view of mutable list by casting them to list **/
val sudoers: List<Int> = systemUsers

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSudoer(4)    //updates the MutableList. All related read-only views are updated
    println("Total sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }
    //getSysSudoers().add(5) <- Error!  //attempting to write to the read-only view cause a compiler error
}