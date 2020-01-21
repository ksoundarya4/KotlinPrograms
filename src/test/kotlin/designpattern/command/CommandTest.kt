/**
 * Design Pattern
 * @purpose To test Factory design pattern
 * @file CommandTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 16/01/2020
 */
package designpattern.command

import org.junit.Test
import kotlin.test.assertEquals

class CommandTest{

    @Test
    fun createCommandProcessor_testOrderList() {

        val commandProcessor = CommandProcessor()
        commandProcessor.addOrders(OrderAddCommand(1))
        commandProcessor.addOrders(OrderAddCommand(2))
        commandProcessor.addOrders(OrderPayCommand(2))
        commandProcessor.addOrders(OrderPayCommand(1))
        commandProcessor.processOrders()

        assertEquals(commandProcessor.orders.size,0,"Test")
    }
}