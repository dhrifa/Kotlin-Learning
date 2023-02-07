package com.example.kotlinlearning.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep

/*
* In this example, a coroutine is launched in the global scope and the delay function is used to pause the coroutine for a specified amount of time.
* */
fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Hello from coroutine!")
    }
    println("Hello from main!")
    sleep(2000)
    //runBlocking { delay(2000L) }
}