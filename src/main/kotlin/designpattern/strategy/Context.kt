/**
 * Design Pattern
 * @purpose To implement strategy design pattern.
 * @file Context.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.strategy

/**
 * Context class having strategy
 */
class Context(private val strategy: Strategy) {

    /**
     * Function that executes Strategy.
     */
    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }
}