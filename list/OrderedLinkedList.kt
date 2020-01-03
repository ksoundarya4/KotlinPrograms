/**
 * DataStructure Program
 *
 * @purpose To build Ordered LinkedList without using Collection Library
 * @file OrderedLinkedList.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelabs.list

/**
 *To create OrderedLinkedList class which has head node ,
 * last Node and LinkedList size
 */
data class OrderedLinkedList<T : Comparable<T>>(
    private var head: Node<T>? = null,
    private var last: Node<T>? = null,
    private var size: Int = 0
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

    /**
     * Function to add items to Ordered LinkedList in ascending order.
     *
     * @param data items to be added to LinkedList.
     */
    fun add(data: T) {
        val node = Node(data)

        if (head == null && last == null) {
            head = node
            last = node
        } else if (head!!.data!!.compareTo(data) >= 0) {
            val temp = head
            head = node
            node.next = temp
        } else {
            var temp: Node<T>? = head

            while (temp!!.next != null && temp.next!!.data!!.compareTo(data) < 0) {
                temp = temp.next
            }
            if (temp.next == null) {
                last!!.next = node
                last = node
            } else {
                var previousTemp: Node<T>? = temp.next
                temp.next = node
                node.next = previousTemp
            }
        }
    }
}
