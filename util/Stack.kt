/**
 * Data Structures
 * @purpose To implement stack using a node.
 * @file Stack.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.stack

import com.bridgelabs.util.Node

/**
 * Stack class which has top node and size
 */
data class Stack<T : Comparable<T>>(
    private var top: Node<T>? = null,
    var size: Int = 0
) {
    /**
     * Function to override toString function
     */
    override fun toString(): String {
        var str = ""
        var temp: Node<T>? = top

        while (temp != null) {
            if (temp.next != null)
                str += temp.data.toString() + ","
            if (temp.next == null)
                str += temp.data
            temp = temp.next
        }
        return "[$str]"
    }

    /**
     * Function to add new item to the top of the stack.
     *
     * @param data item to be added to stack.
     */
    fun push(data: T) {

        val newNode = Node(data)
        newNode.next = top
        top = newNode
        size++
    }

    /**
     * Function that removes top item of the stack
     *
     * @return Top item of stack
     */
    fun pop(): T {
        if (size == 0) throw StackIsEmptyException(" Stack is Empty ")

        val oldNode = top!!
        top = oldNode.next
        size--
        return oldNode.data!!
    }

    /**
     * Function that returns top item of stack
     * but does not removes it
     *
     * @return top item of stack
     */
    fun peek(): T {
        if (this.isEmpty()) {
            throw StackIsEmptyException(" Stack is Empty ")
        }
        return top!!.data!!
    }

    /**
     * Function to check whether stack is empty or not.
     *
     * @return true if stack is empty
     */
    fun isEmpty(): Boolean {
        if (size == 0) return true
        return false
    }
}