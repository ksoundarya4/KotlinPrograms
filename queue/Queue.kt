package com.bridgelabs.queue

import com.bridgelabs.list.Node

data class Queue<T>(
    private var head: Node<T>? = null,
    private var tail: Node<T>? = null,
    var size: Int = 0
) {
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

    fun enequeue(data: T) {
        val newNode = Node<T>(data)

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

    fun dequeue(): T {
        if (isEmpty()) throw QueueIsEmptyException(" Queue is Empty ")

        val oldNode = head!!
        head = oldNode.next
        size--
        return oldNode.data!!
    }

    fun isEmpty(): Boolean {
        if (size == 0) return true
        return false
    }
}