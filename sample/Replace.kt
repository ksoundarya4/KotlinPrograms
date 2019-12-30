/**
 * @purpose To replace "<<UserName>>" with user name and print the result
 * @file Replace.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 28/12/2019
*/
package com.bridgelabs.sample

/**
 * templet value in which <<UserName>> has to be replaced.
 */
const val TEMPLET: String = "Hello <<UserName>> , How are you?"
/**
 * Variable that stores user Name.
 */
var userName = "Soundarya"

/**
 * main function
 * <<UserName>> in templet is replaced by user name
 * prints result to console
 */
fun main() {
    println(TEMPLET.replace("<<UserName>>", userName))
}

