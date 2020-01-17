/**
 * Design Pattern
 * @purpose To implement observer design pattern
 * @file Student.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

/**
 * Student interface
 */
interface Student {

    /**
     * @param observer that has to be registered
     */
    fun registerObserver(observer : Observer)

    /**
     * @param observer that has to be removed
     */
    fun removeObserver(observer : Observer)

    /**
     * Function to notify the observer.
     */
    fun notifyObserver()
}