/***********************************
 * @purpose To replace "<<UserName>>" with user name and print the result
 * @file Replace.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 28/12/2019
 ***********************************
 **********************************/
package com.bridgelabs.sample

val templet: String = "Hello <<UserName>> , How are you?"
var name = "Soundarya"
fun main() {

    val result = "${templet.replace("<<UserName>>", name)}"
    println(result)
}

