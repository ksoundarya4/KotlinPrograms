/**
 * Object Oriented Program
 * @description CompanyShares object which has Stock Symbol
 * and Number of Shares as well as DateTime of the transaction.
 * @file CompanyShare.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.stock

import java.time.LocalDateTime

data class CompanyShare(val stockSymbol: String,
                        var numberOfShare: Int,
                        val sharePrice: Int,
                        var dateOfTransaction: LocalDateTime) {

    /**
     *Function to override equals function.
     */
    override fun equals(other: Any?): Boolean {
        if (other is CompanyShare) {
            if (other.stockSymbol == this.stockSymbol &&
                    other.numberOfShare == this.numberOfShare &&
                    other.sharePrice == this.sharePrice &&
                    other.dateOfTransaction == this.dateOfTransaction) return true
        }
        return false
    }

    /**
     *Function to override equals function.
     */
    override fun hashCode(): Int {
        return (stockSymbol + numberOfShare.toString() +sharePrice.toString()+ dateOfTransaction.toString()).hashCode()
    }

    /**
     *Function to override toString function.
     * To print company share details
     */
    override fun toString(): String {
        return "CompanyShare : $stockSymbol,$numberOfShare,$sharePrice,$dateOfTransaction"
    }
}