package com.bridgelabs.queue

class BankCashCounter(var cashBalance: Int = 100000) {

    val queue = Queue<String>()

    fun cashDeposite(cash: Int) {
        cashBalance += cash
        println("Available cash Balance = $cashBalance")
        queue.dequeue()
    }

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

    fun addPeopleToQueue(peopleCount: Int) {
        for (index in 1..peopleCount) {
            println("Enter $index st Person Name ")
            val personName = readLine()!!.toString()
            queue.enequeue(personName)
        }
    }

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

    fun main() {

        val cashCounter = BankCashCounter()

        println("Enter number of people to be added to queue")
        val peopleCount = readLine()!!.toInt()
        cashCounter.addPeopleToQueue(peopleCount)
        cashCounter.perform(peopleCount)
    }