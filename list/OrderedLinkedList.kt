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
}