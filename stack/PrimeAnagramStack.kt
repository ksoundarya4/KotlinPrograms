package com.bridgelabs.stack

import com.bridgelabs.list.OrderedLinkedList
import com.bridgelabs.list.primeAnagram

fun main() {
    val primeAnagramList : OrderedLinkedList<Int> = primeAnagram()
    val stack = Stack<Int>()

    for(index in 0.until(primeAnagramList.size)) {
        stack.push(primeAnagramList.get(index))
    }
    for(index in 0.until(stack.size))
        println(stack.pop())
}