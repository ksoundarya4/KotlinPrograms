/**
 * DataStructure Program
 *
 * @purpose To build Unordered LinkedList without using Collection Library
 * @file UnorderedLinkedList.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelabs.stock

import com.bridgelabs.util.Node
import com.bridgelabs.util.OutOfSizeException

/**
 *To create UnorderedLinkedList class which has head node ,
 * last Node and LinkedList size
 */
class LinkedList <T>(
        private var head: Node<T>? = null,
        private var last: Node<T>? = null,
        var size: Int = 0
) {

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
     * Function to check if LinkedList is empty or not
     *
     * @return true - LinkedList is empty
     */
    fun isEmpty(): Boolean {
        if (size == 0) return true
        return false
    }

    /**
     * Function to remove an element from LinkedList
     *
     * @param data - data to be removed from LinkedList
     * @return true- if data is present in the LinkedList and remove it
     */
    fun remove(data: T): Boolean {
        var temp: Node<T>? = head
        var previousTemp: Node<T>? = null

        if (head == null) {
            println("LinkedList is empty")
        }

        if (temp != null && temp.data!! == data) {
            head = temp.next
            size--
            return true
        }

        while (temp != null && temp.data != data) {
            previousTemp = temp
            temp = temp.next
        }

        if (temp == null)
            return false

        previousTemp!!.next = temp.next
        size--
        return true
    }

    /**
     * Function to search an item in LinkedList.
     *
     * @param data item to be searched.
     * @return true if item is present in LinkedList.
     */
    fun search(data: T): Boolean {
        var temp: Node<T>? = head

        if (head == null) {
            println("LinkedList is empty. Nothing is present to search")
        }
        while (temp != null) {
            if (temp.data == data)
                return true
            temp = temp.next
        }
        return false
    }

    /**
     * Function to add new element at position
     *
     * @param position - to insert the element into the LinkedList.
     * @param data - element to be inserted.
     */
    fun insert(position: Int, data: T) {

        if (position > size || position < 0) throw OutOfSizeException("Position $position is out of bound with LinkedList size ${size}")

        val node: Node<T> = Node(data)

        var count = 0
        var temp: Node<T>? = head
        var previousTemp: Node<T>? = null


        if (!search(data)) {
            if (position == 0) {
                head = node
                node.next = temp
            }
            if (position > 0) {
                while (count < position) {
                    previousTemp = temp
                    temp = temp!!.next
                    count++
                }
                node.next = temp
                previousTemp!!.next = node
            }
            size++
        }

    }


    /**
     * Function to return elements present in the given index.
     *
     * @param index : Specifies the index of element in the LinkedList.
     * @return T : element present in that index
     */
    fun get(index: Int): T {
        var count = 0
        var temp: Node<T>? = head

        while (count < index) {
            count++
            temp = temp!!.next
        }
        return if (temp != null) {
            temp.data!!
        } else throw OutOfSizeException(" $index is out of bound with LinkedList size ${size}")

    }
}
