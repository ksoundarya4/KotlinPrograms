/**
 * Design Pattern
 * @purpose To implement command design pattern.
 * @file OrderPayCommand.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01
 */
package designpattern.command

/**
 * Class OrderPayCommand implements OrderCommand
 * having order id.
 */
class OrderPayCommand(private val id : Int) : OrderCommand {

    override fun execute() {
        println("Paying for order with id $id")
    }
}