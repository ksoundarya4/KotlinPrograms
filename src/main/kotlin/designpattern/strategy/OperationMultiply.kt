/**
 * Design Pattern
 * @purpose To implement strategy design pattern.
 * @file OperationMultiply.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.strategy

/**
 * OperationMultiply implements Strategy
 */
class OperationMultiply : Strategy {

    /**
     * Function to override doOperation
     *
     * @param num1 to multiply
     * @param num2 to multiply
     * @return num1 * num2
     */
    override fun doOperation(num1: Int, num2: Int): Int {
        return num1*num2
    }
}