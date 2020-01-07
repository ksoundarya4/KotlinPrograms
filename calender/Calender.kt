/**
 * Data Structures
 * @description Calendar function that takes the month and year as argument
 * and prints the Calendar of the month.
 *
 *   July 2005
 *   S  M  T  W Th  F  S
 *                  1  2
 *   3  4  5  6  7  8  9
 *  10 11 12 13 14 15 16
 *  17 18 19 20 21 22 23
 *  24 25 26 27 28 29 30
 *  31
 *
 *  @file Calender.kt
 *  @author ksoundarya4
 *  @version 1.0
 *  @since 06/01/2020
 */
package com.bridgelabs.calender

import com.bridgelabs.list.countDigitsOf
import com.bridgelabs.list.day
import com.bridgelabs.list.isLeapYear

fun calenderOf(month: Int, year: Int) {
    val months = arrayOf(
        "",
        "January", "Febrauary", "March",
        "April", "May", "June", "July",
        "August", "September", "October",
        "November", "December"
    )

    val days = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    if(month == 2 && isLeapYear(year))
        days[month] = 29

    println("${months[month]} $year")
            println("Sun Mon Tue Wed Thu Fri Sat")

    val day = day(1,month,year)

    for(index in 0.until(day))
        print("    ")

    for(index in 1..days[month]){
        if(countDigitsOf(index) == 1)
        print(" $index  ")
        if(countDigitsOf(index) == 2)
            print(" $index ")
        if((index+day) % 7 == 0 || (index == days[month]))
            println()
    }
}

fun main(){
    println("Enter a month")
    val month = readLine()!!.toInt()
    println("Enter a year")
    val year = readLine()!!.toInt()
    calenderOf(month,year)
}
