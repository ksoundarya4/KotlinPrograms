/**
 * Object Oriented Program
 * @description
 * @file CustomerStockManager.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package com.bridgelab.stock

class CustomerStockManager(val customer: Customer) {
    /**
     * To add Company Share to Company Share List
     */
    fun addCompanyShare(companyShare: CompanyShare) {
        customer.stockAccount.companyShareList.add(companyShare)
    }

    /**
     * Function to buy company shares
     */
    fun buyShares(amount: Int, companySymbol: String) {
        customer.stockAccount.buy(amount, companySymbol)
    }

    /**
     * Function to sell customer shares to company
     */
    fun sellShares(numberOfShare: Int, companySymbol: String) {
        customer.stockAccount.sell(numberOfShare, companySymbol)
    }

    /**
     * Function to print company share list
     */
    fun printCompanyShares() {
        println(customer.stockAccount.companyShareList)
    }

    /**
     * Function to print customer stock account details
     */
    fun printCustomer() {
        println(customer)
    }
}