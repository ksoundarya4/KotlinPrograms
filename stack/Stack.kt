package com.bridgelabs.stack

import com.bridgelabs.list.Node

data class Stack<T : Comparable<T>>(
    private var top: Node<T>? = null,
    var size: Int = 0
) {
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

    fun push(data: T) {

        val newNode = Node(data)
        newNode.next = top
        top = newNode
        size++
    }

    fun pop(): T {
        if (size == 0) throw StackIsEmptyException(" Stack is Empty ")

        val oldNode = top!!
        top = oldNode.next
        size--
        return oldNode.data!!
    }
}