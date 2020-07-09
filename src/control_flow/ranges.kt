package control_flow

fun main() {
    /** Iterates over a range starting from 0 up to 3 (inclusive)  **/
    for (i in 0..3) {
        print(i)
    }
    print(" ")

    /** iterates over a range with a custom increment step for consecutive elements **/
    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    /** Iterates over a range in reverse order (downTo) **/
    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    /** Iterates over a char range in alphabetical order **/
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    /** Char ranges support 'step' and 'downTo' as well **/
    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")


    /** Checks if a value is in the range **/
    val x = 2
    if (x in 1..10) {
        print(x)
    }
    print(" ")

    /** !in is the opposite of in **/
    if (x !in 1..4) {
        print(x)
    }
}