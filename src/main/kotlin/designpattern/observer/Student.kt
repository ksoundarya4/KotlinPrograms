/**
 * Design Pattern
 * @purpose To implement observer design pattern
 * @file Student.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

interface Student {

    fun registerObserver(observer : Observer)
    fun removeObserver(observer : Observer)
    fun notifyObserver()
}