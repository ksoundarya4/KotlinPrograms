/**
 * Design Pattern
 * @purpose To implement observer design pattern
 * @file Person.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

/**
 * Person class having name implements Observer
 */
class Person(val name : String) : Observer {

    /**
     * Function that override update function
     */
    override fun update(availability: String) {
        println("Hello $name, product is $availability in store")
    }
}