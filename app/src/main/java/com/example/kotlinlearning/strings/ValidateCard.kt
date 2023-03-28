package com.example.kotlinlearning.strings

fun main() {


    val card = "1111-2321-7625-1234"
    val list = listOf(1111, 1232, 5627, 8121)
    val date = "12/34"
    println("card validation: ${validateCard(card, date, list)}")
}

//
//1) Reverse a string input: aaba -> abaa
//

//
//3) validate a credit card:

fun validateCard(card: String, exp: String, list: List<Int>): Boolean {
    val expDate = exp.replace("/", "")
    val lastFour = card.takeLast(4)

    val firstFour = card.take(4).toInt()
//    val list = listOf(1111, 1232, 5627, 8121)
    return (expDate == lastFour && (firstFour in list))
}

