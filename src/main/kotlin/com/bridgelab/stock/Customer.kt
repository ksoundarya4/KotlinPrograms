package com.bridgelab.stock

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

    override fun toString(): String {
        return "CustomerInfo : ${this.name},$stockAccount"
    }

}