package com.example.kotlinlearning

import kotlin.math.sqrt

class FactorsSum {
}

fun main() {
 val arr = arrayOf(12,4)
    for (item in arr){
        sumFactors(item)
    }
}

fun sumFactors(x: Int) {
    var sum: Int = 1

    for (i in 2..x){// sqrt(x.toDouble()).toInt()) {
        if (x % i == 0) {
            sum += i
        }
    }
    println(sum)
}

