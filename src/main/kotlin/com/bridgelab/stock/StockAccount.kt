package com.bridgelab.stock

import com.bridgelabs.util.LinkedList

class StockAccount {

    val companyShareList = LinkedList<CompanyShare>()
    var totalValue: Double = 0.0

    /**
     * Function to retur total value of all shares.
     */
    fun valueOf(): Double {

        for (index in 0.until(companyShareList.size)) {
            val companyShare = companyShareList.get(index)
            val shareValue = companyShare.numberOfShare.times(companyShare.sharePrice)
            totalValue += shareValue
        }
        return totalValue
    }

    /**
     *Function to buy a company share
     */
    fun buy(amount: Int, companySymbol: String) {

        for (index in 0.until(companyShareList.size)) {

            val companyShare = companyShareList.get(index)

            if (companyShare.stockSymbol == companySymbol) {

                val shareValue = companyShare.numberOfShare.times(companyShare.sharePrice)
                val shareBought = shareValue / amount
                companyShare.numberOfShare -= shareBought
            }
        }
    }

    //  fun sell(amount: Int , companySymbol: String)
}