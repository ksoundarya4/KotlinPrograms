/**
 * Data Structures
 * @description Create a Slot of 10 to store Chain of
 * Numbers that belong to each Slot to efficiently
 * search a number from a given set of number.
 *
 * @logic Firstly store the numbers in the Slot.
 * Since there are 10 Numbers divide each number by 11
 * and the reminder put in the appropriate slot.
 * Create a Chain for each Slot to avoid Collision.
 * If a number searched is found then pop it or else push it.
 *
 * @file HashingFunction.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 06/01/2020
 */
package com.bridgelabs.list

class HashingFunction() {
    /**
     * Array of type ordered Linked list of size 11
     */
    val hashList: Array<OrderedLinkedList<Int>?> = arrayOfNulls(11)

    /**
     * Function to initialize every index of array
     * to ordered linked list.
     */
    fun hashingFunction() {
        for (index in 0.until(hashList.size)) {
            hashList[index] = OrderedLinkedList<Int>()
        }
    }

    /**
     * Function to override toString() function.
     * To print the elements of hashList
     */
    override fun toString(): String {
        var str = ""
        for (index in 0.until(hashList.size)) {
            if (hashList[index] != null)
                str += hashList[index].toString()
        }
        return str
    }

    /**
     * Function to store numbers in hashList
     *
     * @param number to be stored
     */
    fun put(number: Int) {
        hashList[number % 11]?.add(number)
    }

    /**
     * Function to search a number in hashList
     *
     * @param number to be searched in hashList
     */
    fun search(number: Int): Boolean {
        if (hashList[number % 11]!!.search(number))
            return true
        return false
    }

    /**
     * Function to pop a number if already present in hashList.
     *
     * @param number to be poped from hashList.
     */
    fun pop(number: Int) {
        if (hashList[number % 11]!!.search(number)) {
            hashList[number % 11]!!.remove(number)
        }
    }


}

fun main() {
    val hashingFunction = HashingFunction()

    val fileName = "C:\\Users\\soundarya k\\IdeaProjects\\BridgeLabz\\src\\com\\bridgelabs\\list\\NumberFile"
    val list = readNumberFile(fileName)

    hashingFunction.hashingFunction()

    for (index in 0.until(list.size)) {
        hashingFunction.put(list.get(index))
    }
    println(hashingFunction)

    println("Enter a number to be searched")
    val input = readLine()!!.toInt()
    if (hashingFunction.search(input)) {
        hashingFunction.pop(input)
    } else {
        hashingFunction.put(input)
    }

    println(hashingFunction)

}




