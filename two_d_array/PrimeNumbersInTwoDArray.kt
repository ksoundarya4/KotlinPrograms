/**
 * Data Structures
 * @description Take a range of 0 - 1000 Numbers and find
 * the Prime numbers in that range. Store the prime numbers
 * in a 2D Array, the first dimension represents the range
 * 0-100, 100-200, and so on. While the second dimension
 * represents the prime numbers in that range.
 *@file PrimeNumbersInTwoDArray.kt
 *@author ksoundarya4
 *@version 1.0
 *@since 05/01/2020
 */
package com.bridgelabs.two_d_array

import com.bridgelabs.util.isPrime

fun main() {
    val row = 10
    val coloum = 100
    val twoDPrimeArray = Array(row) { IntArray(coloum) }

    /**
     * For Each loop To store Prime Number in 2D Array
     *outerArray points the outer index of 2D array
     *innerArray points the inner index of 2D array
     */
    for (outerArray in 0.until(row)) {
        val col = coloum * outerArray
        var innerCount = 0
        for (innerArray in col.until(col.plus(99))) {
            if (isPrime(innerArray)) {
                twoDPrimeArray[outerArray][innerCount] = innerArray
                innerCount++
            }
        }
    }
    /**
     * For Each loop to print prime numbers
     * that are stored in 2D array.
     */
    for (outerArray in 0.until(row)) {
        for (innerArray in 0.until(100)) {
            if (twoDPrimeArray[outerArray][innerArray] != 0) {
                print(" ${twoDPrimeArray[outerArray][innerArray]} ")
            }
        }
        println()
    }
}

