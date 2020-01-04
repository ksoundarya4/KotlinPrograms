/**
 * Data class
 * @pupose To create a BankAccount that have cash and user can deposit
 * or withdraw cash from it.
 * @file BankAccount.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 04/01/2020
 */
package com.bridgelabs.queue

data class BankAccount(var cash: Double ?= null) {

    /**
     * Function to deposit cash into bank account.
     *
     * @param cash to be added to bank account
     */
    fun cashDeposit(cash: Double) {
        this.cash = this.cash?.plus(cash)
    }

    /**
     * Function to withdraw cash from bank account.
     *
     * @param cash to be withdrawn from bank account
     */
    fun cashWithdraw(cash: Double) {
        if (this.cash == 0.0) {
            println(" No cash to withdraw ")
        }

        if (cash > this.cash!!) {
            println(" Low balance ")
        }

        if (cash < this.cash!!) {
            this.cash = this.cash!!.minus(cash)
        }
    }
}