package com.example.patterns.creational

import java.util.concurrent.atomic.AtomicInteger

fun main() {

    for (i in 1..10) {
        println( CounterSingleton.increment() )
    }

}

object CounterSingleton {

    init {
        println("I was accessed for the first time")
    }

    private val counter = AtomicInteger(0)
    fun increment() = counter.incrementAndGet()

}