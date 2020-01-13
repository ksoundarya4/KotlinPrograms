package com.bridgelab.stock

import com.bridgelabs.util.UnorderedLinkedList

class StockAccount {

    val companyShareList = ArrayList<CompanyShare>()
    var totalValue: Double = 0.0

    /**
     * Function to retur total value of all shares.
     */
    fun valueOf(): Double {
        for (companyShare in companyShareList) {
            val sharevalue = companyShare.numberOfShare.times(companyShare.sharePrice)
            totalValue += sharevalue
        }
        return totalValue
    }

    /**
     *Function to buy a company share
     */
//    fun buy(amount : Int , companySymbol : String){
//        for(companyShare in companyShareList){
//            if()
//
//                }
//    }
}