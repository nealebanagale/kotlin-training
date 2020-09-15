package classes

/***
 * Interfaces
 * - contains definition of abstract methods as well as implementations of non-abstract methods.
 * - may have property but it needs to be abstract or has to provide accessor implementations
 * - cannot contain any state
 */

// Interface
interface MyInterface {
    val test: Int           // abstract property
    fun foo() : String              // abstract method
    fun hello() {           // non-abstract, method with default implementation
        println("hello world")
    }

    // property with implementation
    val prop: Int           // not abstract, valid because it provides accessor
        get() = 23
/***val prop: Int = 23     // not valid inside an interface */
}

// Implements interface
class InterfaceImp : MyInterface {
    override val test: Int = 25         // override
    override fun foo() : String {       // override
        return "Lol"
    }
}

/** Two or more Interfaces in a Class */
interface A {
    fun callMe() {
        println("From interface A")
    }
}
interface B {
    fun callMeToo() {
        println("From interface B")
    }
    fun duplicate() {
        println("dulicate from interface B")
    }
}

class Child: A, B

/** Resolving overriding conflicts */
interface C {
    fun duplicate() {                           // non-abstract
        println("duplicate from interface C")
    }
}
interface D {
    fun duplicate() {                           // non-abstract
        println("duplicate from interface D")
    }
}
class E: C, D {
    override fun duplicate() {
        super<C>.duplicate()
        super<D>.duplicate()
    }
}



fun main() {
    val obj = InterfaceImp()
    println("test = ${obj.test}")
    print("calling hello()...")
    obj.hello()
    print("calling and printing foo()...")
    println(obj.foo())
    print("calling prop...")
    println(obj.prop)

    val mObj = Child()
    mObj.callMe()
    mObj.callMeToo()

    val rObj = E()
    rObj.duplicate()
}