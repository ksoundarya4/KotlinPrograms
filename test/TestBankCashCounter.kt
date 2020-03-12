/**
 * Data Structure
 * @purpose To test Bank Cash Counter code
 * @file TestBankCashCounter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelabs.test

import com.bridgelabs.queue.BankCashCounter

fun main() {

    val cashCounter = BankCashCounter()

    println("Enter number of people to be added to queue")
    val peopleCount = readLine()!!.toInt()
    cashCounter.addPeopleToQueue(peopleCount)
    cashCounter.perform(peopleCount)
}