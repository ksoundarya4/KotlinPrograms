/**
 * Object Oriented Program
 * @purpose Main function to execute stock portfolio
 * @file StockPortfolioMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.stock

fun main() {
    var stockPortfolio = StockPortfolio()
    val fileSystem = FileSystem()
    stockPortfolio = fileSystem.readFile(stockPortfolio.file)
    stockPortfolio.valueOfEachStock()
    println("TotalValue of all shares = ${stockPortfolio.totalPrice}")

}