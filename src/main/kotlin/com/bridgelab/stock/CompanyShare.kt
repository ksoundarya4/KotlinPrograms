package com.bridgelab.stock

import java.time.LocalDateTime

data class CompanyShare(val stockSymbol: String,
                        var numberOfShare: Int,
                        var dateOfTransaction: LocalDateTime) {

    override fun equals(other: Any?): Boolean {
        if (other is CompanyShare) {
            if (other.stockSymbol == this.stockSymbol &&
                    other.numberOfShare == this.numberOfShare &&
                    other.dateOfTransaction == this.dateOfTransaction) return true
        }
        return false
    }

    override fun hashCode(): Int {
        return (stockSymbol+numberOfShare.toString()+dateOfTransaction.toString()).hashCode()
    }

    override fun toString(): String {
        return "$stockSymbol : $numberOfShare,$dateOfTransaction"
    }
}