package com.bridgelab.stock

import java.io.File

class StockPortfolio {

    var stockList = ArrayList<Stock>()
    var file = File("/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/stock/stock.json")
    var totalPrice: Int = 0

    fun valueOfEachStock() {
        for (stock in stockList) {
            val priceOfStock = stock.numberOfShares.times(stock.sharePrice)
            println("${stock.stockName} = $priceOfStock")
            totalPrice += priceOfStock
        }
    }

    override fun toString(): String {
        return stockList.toString()
    }

}