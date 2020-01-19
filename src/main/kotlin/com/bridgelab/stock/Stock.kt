/**
 * Object Oriented Program
 * @description Stock class having stock name,
 * number of shares and price of each share.
 * @file Stock.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.stock

data class Stock(val stockName: String,
                 val numberOfShares: Int,
                 val sharePrice: Int) {

    /**
     * Function to override toString function
     * To print Stock details.
     */
    override fun toString(): String {
        return "$stockName , $numberOfShares , $sharePrice"
    }

    /**
     *Function to override equals function.
     */
    override fun equals(other: Any?): Boolean {
        if (other is Stock) {
            if (other.stockName == this.stockName &&
                    other.numberOfShares == this.numberOfShares &&
                    other.sharePrice == this.sharePrice) return true
        }
        return false
    }

    /**
     * Function to override hashCode function.
     */
    override fun hashCode(): Int {
        return (stockName+numberOfShares.toString()+sharePrice.toString()).hashCode()
    }
}