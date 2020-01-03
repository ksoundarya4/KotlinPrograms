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
package com.bridgelabs.list

fun main() {
    var orderedLinkedList: OrderedLinkedList<String> = OrderedLinkedList()
    orderedLinkedList.add("abhi")
    orderedLinkedList.add("raghav")
    orderedLinkedList.add("bhavesh")
    orderedLinkedList.add("aahana")

    println(orderedLinkedList)
    println(orderedLinkedList.index("rupesh"))
}