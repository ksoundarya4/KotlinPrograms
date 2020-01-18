/**
 * Design Pattern
 * @purpose To implement strategy design pattern.
 * @file Strategy.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.strategy

/**
 * Strategy interface having doOperation method
 */
interface Strategy {
    fun doOperation(num1: Int, num2: Int)
}