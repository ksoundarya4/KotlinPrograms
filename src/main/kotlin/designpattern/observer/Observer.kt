/**
 * Design Pattern
 * @purpose To implement observer design pattern
 * @file Observer.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

/**
 * Observer interface
 */
interface Observer {
    /**
     * update Function
     *
     * @param availability of product
     */
    fun update(availability : String)
}
