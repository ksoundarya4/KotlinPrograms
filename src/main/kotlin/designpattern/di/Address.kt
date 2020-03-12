/**
 * Design Pattern
 * @purpose To implement dependency injection design pattern.
 * @file Address.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.di

/**
 * Address class
 */
data class Address(
        val houseNumber: String,
        val street: String,
        val city: String,
        val state: String,
        val zipCode: String) {

    /**
     * Function to override toString function
     * To print Address
     */
    override fun toString(): String {
        return "Adsress : $houseNumber,$street,$city,$state,$zipCode"
    }
}