/**
 * Design Pattern
 * @purpose To implement command design pattern.
 * @file OrderAddCommand.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01
 */
package designpattern.command

/**
 * Class OrderAddCommand implements OrderCommand
 * having order id.
 */
class OrderAddCommand(private val id : Int) : OrderCommand {

    override fun execute() {
        println("Adding order with id $id")
    }
}