/**
 * Data Structures
 * @purpose to create fun main of Calender class.
 * @file CalenderMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 07/01/2020
 */
package com.bridgelabs.calender
fun main(){
    println("Enter a month")
    val month = readLine()!!.toInt()
    println("Enter a year")
    val year = readLine()!!.toInt()

    val calender = Calender()
    calender.calenderOf(month,year)
}