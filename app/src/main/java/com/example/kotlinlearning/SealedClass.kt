package com.example.kotlinlearning

sealed class SealedClass(val type: String) {
    fun doSomething() {
        println("Hi from sealed class")
    }

    class A : SealedClass("classA") {
        //        override fun doSomething(){}=>error
        fun display() {
            println("hi from Subclass A of Sealed class")
        }
    }

    class C : SealedClass("classC")
}

class B : SealedClass("classB") {
    //    override fun doSomething(){  }=>error
    fun display() {
        println("an other Subclass  of Sealed class")
    }
}

fun display(type: SealedClass) {
    when (type) {
        is SealedClass.A -> println("type class: ${type.type}")
        is SealedClass.C -> println("type class: ${type.type}")
        is B -> println("type class: ${type.type}")
    }
}

fun main() {
//    val sealedClass1 = SealedClass()//=>error
//    val sealedClass2 = SealedClass.doSomething() =>error

    val sealedClass1 = SealedClass.A()
    sealedClass1.display()

    val sealedClass2 = B()
    sealedClass2.display()

    val sealedClass3 = B()
    println("sealed class when cases")
    display(sealedClass1)
    display(sealedClass2)
    display(sealedClass3)
}
