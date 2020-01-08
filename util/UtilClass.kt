/**
 * UtilClass
 *@purpose Contains all the reusable functions
 * @file UtilClass.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.util

import java.io.File
import java.io.PrintWriter

/**
 * Function to read contents of file
 *
 * @param fileName To read the content from.
 * @return content of file in unordered LinkedList.
 */
fun readFlie(fileName: String): UnorderedLinkedList<String> {
    val file = File(fileName)
    val bufferReader = file.bufferedReader()
    val text: String = bufferReader.readLine()

    val unorderedLinkedList = UnorderedLinkedList<String>()
    val stringList = text.split(" ")

    for (index in 0.until(stringList.size)) {
        unorderedLinkedList.add(stringList[index])
    }
    return unorderedLinkedList
}

/**
 *Function to return Ordered Linked list of numbers
 *
 * @param fileName Number file to read numbers.
 * @return Ordered Linked List of numbers
 */
fun readNumberFile(fileName: String): OrderedLinkedList<Int> {
    val file = File(fileName)
    val bufferReader = file.bufferedReader()
    val numbers = bufferReader.readLine()

    val orderedLinkedList = OrderedLinkedList<Int>()
    val numberList = numbers.split(" ")

    for (index in 0.until(numberList.size)) {
        orderedLinkedList.add(numberList[index].toInt())
    }
    return orderedLinkedList

}

/**
 * Function to write the content into file.
 *
 * @param unorderedLinkedList contains elements that should be written to a file.
 * @param fileName contains path to which content should be written.
 */
fun writeFile(unorderedLinkedList: UnorderedLinkedList<String>, fileName: String) {
    var outputString = ""

    for (index in 0.until(unorderedLinkedList.size)) {
        outputString += unorderedLinkedList.get(index) + " "
    }

    val writer = PrintWriter(fileName)
    writer.append(outputString)
    writer.close()
}

/**
 * Function to check whether the number is prime or not.
 *
 * @param number to be checked.
 * @return true if number is prime
 */
fun isPrime(number: Int): Boolean {
    if (number == 0 || number == 1) return false
    if (number % 2 == 0) return false
    if (number == 2) return true
    for (index in 3.until(number / 2)) {
        if (number % index == 0) return false
    }
    return true
}

/**
 * Function to check whether two numbers are Anagram
 *
 * @param number1 first number
 * @param number2 second number
 * @return true if number1 and number2 are anagram.
 */
fun isAnagram(number1: Int, number2: Int): Boolean {
    val firstNumber = number1.toString().toCharArray()
    val secondNumber = number2.toString().toCharArray()

    if (firstNumber.size != secondNumber.size) return false

    firstNumber.sort()
    secondNumber.sort()

    for (index in 0.until(firstNumber.size)) {
        if (firstNumber[index] != secondNumber[index])
            return false
    }
    return true
}

/**
 * Function to Find prime numbers that are anagram in the range 0 to 1000
 *
 * @return ordered linked list of prime numbers that are anagram
 */
fun primeAnagram(): OrderedLinkedList<Int> {

    val primeList = UnorderedLinkedList<Int>()

    val primeAnagramList1 = UnorderedLinkedList<Int>()
    val primeAnagramList2 = UnorderedLinkedList<Int>()

    val finalPrimeAnagram = OrderedLinkedList<Int>()

    for (index in 0..1000) {
        if (isPrime(index)) {
            primeList.add(index)
        }
    }

    for (firstIndex in 0.until(primeList.size)) {
        for (secondIndex in firstIndex.plus(1).until(primeList.size)) {
            if (isAnagram(primeList.get(firstIndex), primeList.get(secondIndex))) {
                primeAnagramList1.add(primeList.get(firstIndex))
                primeAnagramList2.add(primeList.get(secondIndex))
            }
        }
    }

    for (index in 0.until(primeAnagramList1.size)) {
        primeAnagramList1.insert(index, primeAnagramList2.get(index))
    }
    for (index in 0.until(primeAnagramList1.size)) {
        finalPrimeAnagram.add(primeAnagramList1.get(index))

    }
    return finalPrimeAnagram
}

/**
 * Function to obtain prime numbers from 0 to 1000
 *
 * @return primeList of prime numbers from 0 to 1000
 */
fun primeNumbersOf(number1: Int = 0, number2: Int = 1000): UnorderedLinkedList<Int> {

    val primeList = UnorderedLinkedList<Int>()
    for (index in number1..number2) {
        if (isPrime(index)) primeList.add(index)
    }
    return primeList
}

/**
 * Function to count number of digits in a number.
 *
 * @param number to count number of digits.
 * @return number of digits in number.
 */
fun countDigitsOf(number: Int): Int {
    var number1 = number
    var countDigit = 0
    while (number1 > 0) {
        number1 /= 10
        countDigit++
    }
    return countDigit
}

/**
 * Function to check whether year is Leap year or not.
 *
 * @param year
 * @return true if year is leap year.
 */
fun isLeapYear(year: Int): Boolean {
    if (countDigitsOf(year) == 4) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true
    }
    return false
}

/**
 * * To find the day of the week that date falls on.
 *
 * @param{int}year -Input year
 * @param{int}month -Input month
 * @param{int}date - Input date
 * @return{int} 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
 */
fun day(date: Int, month: Int, year: Int): Int {
    var year: Int = year - (14 - month) / 12
    val x: Int = year + year / 4 - year / 100 + year / 400
    val month = month + 12 * ((14 - month) / 12) - 2

    return (date + x + 31 * month / 12) % 7
}