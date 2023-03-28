package com.example.kotlinlearning

import kotlin.math.sqrt


fun main() {
    val arr = arrayOf(12, 4, 1)
    for (item in arr) {
        sumFactors(item)
    }
}

fun sumFactors(x: Int) {
    var sum: Int = 1

    for (i in 2..x / 2) {
        if (x % i == 0) {
            sum += i
        }
    }
    if (x != 1) sum += x
    println(sum)
}

