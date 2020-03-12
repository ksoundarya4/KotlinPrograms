/**
 * @description Add the Prime Numbers that are Anagram
 * in the Range of 0 - 1000 in a Stack using the Linked
 * List and Print the Anagrams in the Reverse Order.
 * @file PrimeAnagramStack.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 04/01/2020
 */
package com.bridgelabs.test

import com.bridgelabs.stack.Stack
import com.bridgelabs.util.OrderedLinkedList
import com.bridgelabs.util.primeAnagram

fun main() {
    val primeAnagramList: OrderedLinkedList<Int> = primeAnagram()
    val stack = Stack<Int>()

    for (index in 0.until(primeAnagramList.size)) {
        stack.push(primeAnagramList.get(index))
    }
    for (index in 0.until(stack.size))
        println(stack.pop())
}