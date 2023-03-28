package com.example.kotlinlearning.strings


fun main() {

//
//2) Replace annotations in a string with the provided map.
//Example -> input one: "some random string @test challenge @okay"
//Input two: @test is Laptop, @okay is Gone
//Output: some random string Laptop challenge Gone
//

    var paragragh = "some random string @test challenge @okay"

    val list = mapOf<String, String>(
        "@test" to "laptop",
        "@okay" to "gone"
    )

    list.forEach {
        paragragh = paragragh.replace(it.key, it.value)
    }

    println(paragragh)

}

//var num = 321
//var sum = 0
//while (num > 0) {
//    sum = sum + num % 10
//    num = num / 10
//}

//val there = arr.sortedBy { sum.indexOf(it) }