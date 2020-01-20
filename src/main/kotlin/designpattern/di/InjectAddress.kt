/**
 * Design Pattern
 * @purpose To implement dependency injection design pattern
 * @file InjectAddress.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.di

/**
 * InjectAddress interface used to inject Address
 * to required class.
 */
interface InjectAddress {
    fun setAddress(address: Address)
}