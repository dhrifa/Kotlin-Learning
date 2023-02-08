package com.example.kotlinlearning

data class Person(
    val id: Int,
    var name: String
)

data class Person1(val id:Int){
    var name: String = ""
}

fun main(){
    val person1 = Person(1, "David")
    val person2 =Person1(2)
    person2.name = "Jack"

    val person3 =  person1.copy(id = 3)
    println(person3)
}