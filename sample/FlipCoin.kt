/************************
 * @purpose To Flip Coin and print percentage of Heads and Tails.
 * @file FlipCoin.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 30/12/2019
 ************************
 ***********************/
package com.bridgelabs.sample

/**
 * Function to flip a coin trails number of times
 * and return heads vs tails.
 *
 * @param tails : Number of times to flip a coin.
 * @return heads/tails.
 */
fun flipCoin(trails: Int): Double {
    var heads: Int = 0
    var tails: Int = 0
    for (index in 0.rangeTo(trails)) {
        if (Math.random() > 0.5) heads++
        tails++
    }
    return heads.toDouble() / tails
}

/**
 * Main function to print
 * number of heads vs number of tails.
 *
 * @param tails : Takes in number of times to flip a coin.
 * @param headvstail : number of heads / number of tails.
 */
fun main() {
    val tails = 100
    val headvstail = flipCoin(tails)
    println("Head v/s Tails are $headvstail")
}