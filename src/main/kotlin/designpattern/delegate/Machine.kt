/**
 * Design Pattern
 * @purpose To implement delegate design pattern.
 * @file Machine.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.delegate

/**
 * Machine class having delegateEngine
 */
class Machine {

    val delegateEngine : Engine = DieselEngine()

    /**
     * Function to start machine.
     */
    fun start() {
        delegateEngine.start()
    }
}