/**
 * Data Structure
 * @purpose To test the Ordered LinkedList implementation
 * @file TestOrderedList.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.list

fun main() {
    var orderedLinkedList: OrderedLinkedList<Int> = OrderedLinkedList()
    orderedLinkedList.add(1)
    orderedLinkedList.add(3)
    orderedLinkedList.add(2)
    orderedLinkedList.add(0)
    println(orderedLinkedList)
}