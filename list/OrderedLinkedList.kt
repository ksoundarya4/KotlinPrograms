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
     * Function to add items to Ordered LinkedList in ascending order.
     *
     * @param data items to be added to LinkedList.
     */
    fun add(data: T) {
        val newNode = Node(data)

        if (head == null && last == null) {
            head = newNode
            last = newNode
        } else if (head!!.data!! >= data) {
            val temp = head
            head = newNode
            newNode.next = temp
        } else {
            var temp: Node<T>? = head

            while (temp!!.next != null && temp.next!!.data!! < data) {
                temp = temp.next
            }
            if (temp.next == null) {
                last!!.next = newNode
                last = newNode
            } else {
                val nextTemp: Node<T>? = temp.next
                temp.next = newNode
                newNode.next = nextTemp
            }
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

        if (temp != null && temp.data!!.compareTo(data) == 0) {
            head = temp.next
            size--
            return true
        }

        while (temp != null && temp.data!!.compareTo(data) != 0) {
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
            if (temp.data!!.compareTo(data) == 0)
                return true
            temp = temp.next
        }
        return false
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

    /**
     * Function that returns index of the item in the Linked List.
     *
     * @param data item whose index is returned
     * @return indexCount of an item.
     */
    fun index(data : T) : Int {
        var temp : Node<T> ?= head
        var indexCount = 0

        while(temp!=null && temp.data!!.compareTo(data) != 0) {
            temp = temp.next
           ++indexCount
        }

        if(temp == null) throw DataNotFoundException("$data is not found in Linked List")

        return indexCount
    }

}
