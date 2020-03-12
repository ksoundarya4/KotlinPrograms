/**
 * Data Structures
 * @description Create a Program which creates Banking Cash Counter
 * where people come in to deposit Cash and withdraw Cash.
 * Have an input panel to add people to Queue to either deposit
 * or withdraw money and dequeue the people. Maintain the Cash Balance.
 * @file BankCashCounter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 06/01/2020
 */
package com.bridgelabs.queue

/**
 *BankCashCounter which will have one lack
 *of initial cash balance
 */
class BankCashCounter(var cashBalance: Int = 100000) {

    val queue = Queue<String>()

    /**
     * Function to deposit cash to Bank cash counter
     *
     * @param cash to be deposited
     */
    fun cashDeposite(cash: Int) {
        cashBalance += cash
        println("Available cash Balance = $cashBalance")
        queue.dequeue()
    }

    /**
     * Function to withdraw cash from Bank cash counter
     *
     * @param cash to be withdrawn
     */
    fun cashWithdraw(cash: Int) {
        if (cashBalance == 0 || cashBalance < cash) {
            println("Low cash Balance")
            queue.dequeue()
        } else {
            cashBalance -= cash
            println("Available cash Balance = $cashBalance")
            queue.dequeue()
        }
    }

    /**
     * Function to add people to queue
     *
     * @param peopleCount number of people that are added to queue
     */
    fun addPeopleToQueue(peopleCount: Int) {
        for (index in 1..peopleCount) {
            println("Enter $index st Person Name ")
            val personName = readLine()!!.toString()
            queue.enequeue(personName)
        }
    }

    /**
     * Function to perform cash withdraw or cash deposit
     *
     *@param peopleCount number of people in the queue need
     * to perform withdraw or deposit.
     */
    fun perform(peopleCount: Int) {
        for (index: Int in 1..peopleCount) {
            println(queue)
            println(" Person $index performing")
            println("Enter 1 to cash withdraw or 2 to cash deposit")
            val choice = readLine()!!.toInt()
            when (choice) {
                1 -> {
                    println("Enter cash to withdraw")
                    val cash = readLine()!!.toInt()
                    cashWithdraw(cash)
                }
                2 -> {
                    println("Enter cash to deposit")
                    val cash = readLine()!!.toInt()
                    cashDeposite(cash)
                }
                else -> {
                    println("Enter valid choice")
                    queue.dequeue()
                }
            }
            if (queue.isEmpty()) println("Queue is Empty")
        }
    }
}

