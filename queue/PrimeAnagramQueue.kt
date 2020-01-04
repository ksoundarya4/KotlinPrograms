/**
 * @description Add the Prime Numbers that are Anagram
 * in the Range of 0 - 1000 in a Queue using the Linked
 * List and Print the Anagrams from the Queue.
 * @file PrimeAnagramQueue.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 04/01/2020
 */
package com.bridgelabs.queue

import com.bridgelabs.list.OrderedLinkedList
import com.bridgelabs.list.primeAnagram

fun main() {
    val primeAnagramList : OrderedLinkedList<Int> = primeAnagram()
    val queue = Queue<Int>()

    for(index in 0.until(primeAnagramList.size)) {
        queue.enequeue(primeAnagramList.get(index))
    }
    for(index in 0.until(queue.size))
        println(queue.dequeue())
}
