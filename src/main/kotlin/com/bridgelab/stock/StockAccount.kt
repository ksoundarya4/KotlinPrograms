package com.bridgelab.stock

import com.bridgelabs.util.LinkedList
import java.io.PrintWriter

class StockAccount(var cashBalance : Double , var numberOfShares: Int){

    val companyShareList = LinkedList<CompanyShare>()

    /**
     * Function to retur total value of all shares.
     */
    fun valueOf(): Double {
        return cashBalance
    }

    /**
     *Function to buy a company share
     */
    fun buy(amount: Int, companySymbol: String) {

        for (index in 0.until(companyShareList.size)) {
            val companyShare = companyShareList.get(index)

            if (companyShare.stockSymbol == companySymbol) {
                val shareValue = companyShare.numberOfShare.times(companyShare.sharePrice)

                if (amount > companyShare.sharePrice) {
                    val shareBought = shareValue / amount
                    companyShare.numberOfShare -= shareBought
                    cashBalance -= amount
                    numberOfShares += shareBought
                }
            }
        }
    }

    /**
     * Function to sell shares
     */
    fun sell(numberOfShares: Int, companySymbol: String) {

        for (index in 0.until(companyShareList.size)) {
            val companyShare = companyShareList.get(index)

            if (companyShare.stockSymbol == companySymbol) {
                companyShare.numberOfShare += numberOfShares
                val shareValue = numberOfShares.times(companyShare.sharePrice)
                cashBalance += shareValue
                this.numberOfShares -= numberOfShares
            }
        }
    }

    /**
     * Function to save Stock Account into file
     */
    fun saveFile(fileName: String) {
        val AccountInfo = "AccountBalance : ${this.cashBalance} , NumberOfShares : ${this.numberOfShares}"

        val writer = PrintWriter(fileName)
        writer.append(AccountInfo)
        writer.close()
    }

    /**Function to print detailed report of
     * stocks and values
     */
    fun printReport() {
        println("--------------------")
        println("Stock Account details")
        println()
        println("Account Balance : ${this.cashBalance}\n" +
                "NumberOfShares : ${this.numberOfShares}")
    }
}