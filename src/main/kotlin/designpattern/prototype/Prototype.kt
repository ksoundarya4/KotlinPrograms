/**
 * Design Pattern
 * @purpose to implement prototype design pattern.
 * @file Prototype.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.prototype

/**
 * Prototype Interface having clone function.
 */
interface Prototype {
    fun clone() : Any
}