/**
 * Design Pattern
 * @purpose To create a singleton design pattern
 * @file Singleton.kt
 * @author ksoundarya4
 * @version 1.00
 * @since 16/01/2020
 */
package designpattern.singleton

object Singleton {
    init {
        println("Singleton Object")
    }

    fun print() {
        println("Singleton Object print function")
    }

    fun dosomething() {
        println("Doing something")
    }
}

fun main() {
    Singleton.print()
    Singleton.dosomething()
    Singleton.print()
}