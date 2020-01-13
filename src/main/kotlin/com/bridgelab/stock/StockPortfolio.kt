/**
 * Object Oriented Program
 * @description Write a program to read in Stock Names,
 * Number of Share, Share Price. Print a Stock Report with
 * total value of each Stock and the total value of Stock.
 * @file StockPortfolio.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.stock

import java.io.File

class StockPortfolio {

    var stockList = ArrayList<Stock>()
    var file = File("/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/stock/stock.json")
    var totalPrice: Int = 0

    /**
     *Function to calculate price of each stock
     * and print them
     */
    fun valueOfEachStock() {
        for (stock in stockList) {
            val priceOfStock = stock.numberOfShares.times(stock.sharePrice)
            println("${stock.stockName} = $priceOfStock")
            totalPrice += priceOfStock
        }
    }

    /**
     * Function to override toString function
     * To print list of stocks.
     */
    override fun toString(): String {
        return stockList.toString()
    }

}