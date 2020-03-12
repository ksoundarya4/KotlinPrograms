/**
 * Design Pattern
 * @purpose To implement delegate design pattern.
 * @file PetrolEngine.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.delegate

/**
 * class PetrolEngine implementing Engine
 */
class PetrolEngine : Engine {

    override fun start() {
        println("Starting Petrol engine")
    }
}