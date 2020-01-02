/**
 * DataStructure Program
 *
 * @purpose To build Unordered LinkedList without using Collection Library
 * @file UnorderedLinkedList.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelabs.list

/**
 *To create UnorderedLinkedList class which has head node ,
 * last Node and LinkedList size
 */
class UnorderedLinkedList<T>(private var head: Node<T>? = null, private var last: Node<T>? = null, var size: Int = 0) {

    /**
     *Function that overrides toString
     * To print the LinkedList
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
     * Function to add elemets to LinkedList
     *
     * @param data - Accepts the data that will be added to the LinkedList
     */
    fun add(data: T) {
        val node = Node(data)
        if (head == null && last == null) {
            head = node
            last = node
        }
        if (head != null) {
            last?.next = node
            last = node
        }
        size++
    }

    /**
     * Function to get the size of LinkedList
     */
    fun size() = size


}