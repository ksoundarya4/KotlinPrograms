/**
 * Data Structures
 * @purpose main function to check working of hashing function
 * @file TestHashingFunction.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelabs.test

import com.bridgelabs.util.HashingFunction
import com.bridgelabs.util.readNumberFile


fun main() {
    val hashingFunction = HashingFunction()

    val fileName = "C:\\Users\\soundarya k\\IdeaProjects\\BridgeLabz\\src\\com\\bridgelabs\\util\\NumberFile"
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