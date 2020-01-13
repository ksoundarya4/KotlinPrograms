/**
 * Data Structures
 * @purpose To implement queue data structure.
 * @file Queue.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.queue

import com.bridgelab.util.QueueIsEmptyException
import com.bridgelabs.util.Node

/**
 * Queue class which has head node,
 *tail node and queue size.
 */
data class Queue<T>(
    private var head: Node<T>? = null,
    private var tail: Node<T>? = null,
    var size: Int = 0
) {
    /**
     *Function that override toString()
     * to print elements of Queue
     */
    override fun toString(): String {
        var string = ""
        var temp = head
        while (temp != null) {
            if (temp.next == null) {
                string += temp.data.toString()
            }
            if (temp.next != null) {
                string += temp.data.toString() + ","
            }
            temp = temp.next
        }
        return "[$string]"
    }

    /**
     * Function to add a new item to a queue
     *
     * @param data item to be added to a queue
     */
    fun enequeue(data: T) {
        val newNode = Node(data)

        if (head == null && tail == null) {
            head = newNode
            tail = newNode
        }

        if (head != null) {
            tail?.next = newNode
            this.tail = newNode
        }
        size++
    }

    /**
     * Function to remove front item from queue
     *
     * @return item removed from queue
     */
    fun dequeue(): T {
        if (isEmpty()) throw QueueIsEmptyException(" Queue is Empty ")

        val oldNode = head!!
        head = oldNode.next
        size--
        return oldNode.data!!
    }

    /**
     * Function to test whether queue is empty
     *
     * @return true if queue is empty
     */
    fun isEmpty(): Boolean {
        if (size == 0) return true
        return false
    }
}