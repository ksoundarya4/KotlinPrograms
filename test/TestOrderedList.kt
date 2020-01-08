/**
 * Data Structure
 * @description Read .a List of Numbers from a
 * file and arrange it ascending Order in a Linked List.
 * Take user input for a number, if found then
 * remove the number out of the list else insert
 * the number in appropriate position
 * @file TestOrderedList.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.test

import com.bridgelabs.util.readNumberFile

fun main() {
    val fileName = "C:\\Users\\soundarya k\\IdeaProjects\\BridgeLabz\\src\\com\\bridgelabs\\list\\NumberFile"
    val orderedLinkedList = readNumberFile(fileName)
    println(orderedLinkedList)

    println("Enter a number to be searched")

    val input = readLine()!!.toInt()

    if(orderedLinkedList.search(input)){
        println("$input found at index ${orderedLinkedList.index(input)}")
        orderedLinkedList.remove(input)
        println("List after removing $input : $orderedLinkedList")
    }

    if(!orderedLinkedList.search(input)) {
        println("$input is not present in the List")
        orderedLinkedList.add(input)
        println("List after adding $input : $orderedLinkedList")
    }

}