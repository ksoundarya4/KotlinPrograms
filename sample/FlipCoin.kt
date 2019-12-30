/************************
 * @purpose To Flip Coin and print percentage of Heads and Tails.
 * @file FlipCoin.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 30/12/2019
 ************************
 ***********************/
package com.bridgelabs.sample

fun flipCoin(trails: Int): Double {
    var heads: Int = 0
    var tails: Int = 0
    for (index in 0.rangeTo(trails)) {
        if (Math.random() > 0.5) heads++
        tails++
    }
    return heads.toDouble() / tails
}
fun main()
{
    val tails = 100
    val headvstail = flipCoin(tails)
    println("Head v/s Tails are $headvstail")
}