/**
 * Design Pattern
 * @purpose To implement command design pattern.
 * @file CommandProcessor.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01
 */
package designpattern.command

/**
 * Class CommandProcessor having list of order commands.
 */
class CommandProcessor {

    private val orders = ArrayList<OrderCommand>()

    /**
     * Function to add order command to orders.
     */
    fun addOrders(orderCommand : OrderCommand){
        orders.add(orderCommand)
    }

    /**
     * Function to execute order command
     * and clear orders.
     */
    fun processOrders(){
        for(orderCommand in orders)
            orderCommand.execute()
        orders.clear()
    }
}