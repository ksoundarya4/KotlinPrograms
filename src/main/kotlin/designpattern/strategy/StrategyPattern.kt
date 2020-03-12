/**
 * Design Pattern
 * @purpose To check strategy design pattern.
 * @file StrategyPattern.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.strategy

fun main() {

    val addContext = Context(OperationAdd())
    println(addContext.executeStrategy(4,5))

    val subtractContext = Context(OperationSubtract())
    println(subtractContext.executeStrategy(4,5))

    val multiplyContext = Context(OperationMultiply())
    println(multiplyContext.executeStrategy(4,5))
}