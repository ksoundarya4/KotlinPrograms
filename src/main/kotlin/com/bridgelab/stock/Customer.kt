/**
 * Object Oriented Programs
 * @description Customer data class having customer name
 * and stock account
 * @file Customer.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 19/01/2020
 */
package com.bridgelab.stock

import java.util.Queue

data class Customer(val name: String, val stockAccount: StockAccount) {

    /**
     * Function to override equals function
     */
    override fun equals(other: Any?): Boolean {
        if (other is Customer) {
            if (other.name == this.name &&
                    other.stockAccount == this.stockAccount) return true
        }
        return false
    }

    /**
     * Function to override toString function
     * To print customer details.
     */
    override fun toString(): String {
        return "CustomerInfo : ${this.name},$stockAccount"
    }

    /**
     * Function to override hashCode function.
     */
    override fun hashCode(): Int {
        return {name+stockAccount.hashCode()}.hashCode()
    }
}