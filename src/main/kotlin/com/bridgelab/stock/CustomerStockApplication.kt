/**
 * Object Oriented Program
 * @purposeTo implement Stock Account
 * @file CustomerStockApplication.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package com.bridgelab.stock

import com.bridgelabs.util.UtilClass
import kotlin.system.exitProcess

fun main() {
    val customer = UtilClass.readCustomerDetails()
    val manager = CustomerStockManager(customer)

    do {
        println("Welcome to Customer Stock Account Application")
        println("---------------------------------------------")
        println("Enter 1 to add CompanyShares")
        println("Enter 2 to buy company share")
        println("Enter 3 to sell customer share")
        println("Enter 4 to print company list")
        println("Enter 5 to print customer details")
        println("Enter 6 to exit")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                val companyShare = UtilClass.readCompanyShare()
                manager.addCompanyShare(companyShare)
            }
            2 -> {
                println("Enter amount to buy company share")
                val amount = readLine()!!.toInt()

                println("CompanySymbol")
                val companySymbol = readLine()!!.toString()

                manager.buyShares(amount, companySymbol)
            }
            3 -> {
                println("Enter number of shares to buy")
                val numberOfShare = readLine()!!.toInt()

                println("CompanySymbol")
                val companySymbol = readLine()!!.toString()

                manager.sellShares(numberOfShare,companySymbol)
            }
            4 -> manager.printCompanyShares()
            5 -> manager.printCustomer()
            6 -> exitProcess(0)
            else -> println("Enter valid choice")
        }
    }while(choice < 7)
}