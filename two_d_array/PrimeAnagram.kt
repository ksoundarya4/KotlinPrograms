

package com.bridgelabs.two_d_array

import com.bridgelabs.util.primeAnagram
import com.bridgelabs.util.primeNumbersOf

class PrimeAnagram {
    fun primeAnagramOf() {
        val primeList = primeNumbersOf()
        println(primeList)
        val twoDPrimeAnagram = Array(2) { IntArray(primeList.size) }
        val primeAnagramList = primeAnagram()


        var count1 = 0
        for (index in 0.until(primeAnagramList.size)) {
            twoDPrimeAnagram[0][count1] = primeAnagramList.get(index)
            count1++
        }

        var count2 = 0
        for (index in 0.until(primeList.size)) {
            if (!primeAnagramList.search(primeList.get(index))) {
                twoDPrimeAnagram[1][count2] = primeList.get(index)
                count2++
            }
        }

        for (outerArray in 0.until(2)) {
            for (innerArray in 0.until(primeAnagram().size)) {
                if (twoDPrimeAnagram[outerArray][innerArray] != 0) {
                    print(" ${twoDPrimeAnagram[outerArray][innerArray]} ")
                }
            }
            println()
        }
    }
}