/**
 * @purpose To Flip Coin and print percentage of Heads and Tails.
 * @file FlipCoin.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 30/12/2019
 */
package com.bridgelabs.sample

/**
 * Function to flip a coin trails number of times
 * and return heads vs tails.
 *
 * @param trails : Number of times to flip a coin.
 * @return heads/tails.
 */
fun flipCoin(trails: Int): Double {
    var heads = 0
    var tails = 0
    for (index in 0.rangeTo(trails)) {
        if (Math.random() > 0.5) heads++
        tails++
    }
    return heads.toDouble() / tails
}

/**
 * Main function to print
 * number of heads vs number of tails.
 */
fun main() {
    val trails = 100
    val headvstail = flipCoin(trails)
    println("Head v/s Tails are $headvstail")
}