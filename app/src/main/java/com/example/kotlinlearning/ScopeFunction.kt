package com.example.kotlinlearning

data class Employe(val id: Int, var name: String? = "",  var lastName: String? = "")

fun main() {
    val person = Employe(1).apply { //person -> //error
        this.name = "john"
        lastName = "Smith"//rettrun context object
    }

    val person2 = Employe(2).let { person->
        person.name = "david"
        person.lastName = "jack"
        person
    }
    //with
    val person3 = with(Employe(3)) {
        name="lili"
        lastName="ortiz"
        this
    }
    //run
    val person4 = Employe(4).run {
        name="henri"
        lastName="carlos"
        this
    }
    //run

    //also
    val person5 =Employe(5).also { employe ->
        employe.name = "lola"
        employe.lastName = "lola"//return context object
    }

    println("$person")
    println("$person2")
    println("$person3")
    println("$person4")
    println("$person5")
}