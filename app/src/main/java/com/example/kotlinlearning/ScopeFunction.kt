package com.example.kotlinlearning

data class Employee(val id: Int, var name: String? = "",  var lastName: String? = "")

fun main() {
    val person = Employee(1).apply { //person -> //error
        this.name = "john"
        lastName = "Smith"//rettrun context object
    }

    val person2 = Employee(2).let { person->
        person.name = "david"
        person.lastName = "jack"
        person
    }
    //with
    val person3 = with(Employee(3)) {
        name="lili"
        lastName="ortiz"
        this
    }
    //run
    val person4 = Employee(4).run {
        name="henri"
        lastName="carlos"
        this
    }
    //run

    //also
    val person5 =Employee(5).also { employee ->
        employee.name = "lola"
        employee.lastName = "lola"//return context object
    }

    println("$person")
    println("$person2")
    println("$person3")
    println("$person4")
    println("$person5")
}