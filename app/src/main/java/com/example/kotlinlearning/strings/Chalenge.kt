package com.example.kotlinlearning.strings


fun main() {
    var list = "12 10 45 2"
    var listInt = arrayListOf<Int>()
    for (num in list.split(" ")) {
        listInt.add(num.toInt())
    }

    var weights = arrayListOf<Int>()
    for (i in listInt) {
        weights.add(sumDigit(i))
    }

    sort(listInt, weights)

    println(listInt)
    println(weights)

}

fun sumDigit(d: Int): Int {
    var sum = 0
    var num = d
    while (num > 0) {
        sum = sum + num % 10
        num = num / 10
    }
    return sum
}

fun sort(arr: ArrayList<Int>, sum: ArrayList<Int>) {
    val map: Map<Int, Int> =
        sum.zip(arr)//{t1,t2 -> t1 to t2}
            .toMap().toSortedMap()
    var str = ""
    map.forEach {
        str = "$str ${it.value}"
    }
    println("map: $map, str: $str")

}














