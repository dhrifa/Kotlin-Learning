package com.example.kotlinlearning

inline fun max(a: Int, b: Int):Int {
    return if (a > b) a else b
}

fun main(){
    val x=1
    val y=2
   println("max is : ${max(x,y)}")

}