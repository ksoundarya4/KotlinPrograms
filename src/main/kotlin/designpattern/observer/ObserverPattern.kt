/**
 * Design Pattern
 * @purpose To implement observer design pattern
 * @file ObserverPattern.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

fun main(){
    val personOne = Person("Jhon")
    val personTwo = Person("Sam")

    val samsungMobile = Product("Samsung","Mobile","Available")

    samsungMobile.registerObserver(personOne)
    samsungMobile.registerObserver(personTwo)

    samsungMobile.notifyObserver()
}

