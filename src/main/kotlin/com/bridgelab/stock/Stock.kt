package com.bridgelab.stock

data class Stock(val stockName: String,
                 val numberOfShares: Int,
                 val sharePrice: Int) {
    override fun toString(): String {
        return "$stockName , $numberOfShares , $sharePrice"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Stock) {
            if (other.stockName == this.stockName &&
                    other.numberOfShares == this.numberOfShares &&
                    other.sharePrice == this.sharePrice) return true
        }
        return false
    }

    override fun hashCode(): Int {
        return (stockName+numberOfShares.toString()+sharePrice.toString()).hashCode()
    }
}