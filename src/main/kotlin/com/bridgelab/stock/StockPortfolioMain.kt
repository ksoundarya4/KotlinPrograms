package com.bridgelab.stock

fun main() {
     var stockPortfolio = StockPortfolio()
    val fileSystem = FileSystem()
    stockPortfolio = fileSystem.readFile(stockPortfolio.file)
    stockPortfolio.valueOfEachStock()
    println("TotalValue of all shares = ${stockPortfolio.totalPrice}")

}