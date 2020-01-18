/**
 * Design Pattern
 * @purpose To implement delegate design pattern.
 * @file DieselEngine
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.delegate

/**
 * Class DieselEngine implementing Engine
 */
class DieselEngine : Engine {

    override fun start() {
        println("Starting diesel engine")
    }
}