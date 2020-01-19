package com.bridgelabs.deque

import com.bridgelab.util.QueueIsEmptyException
import com.bridgelabs.util.Node

class Deque<T>(
    var front: Node<T>? = null,
    var rear: Node<T>? = null,
    var size: Int = 0
) {
    /**
     * Function to override toString()
     * Print elements of deque
     */
    override fun toString(): String {
        var string = ""
        var temp = front

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
     * Function to add new element to front of queue
     *
     *@param data new element that has to be added to queue
     */
    fun addFront(data: T) {
        val newNode = Node<T>(data)
        if (front == null && rear == null) {
            front = newNode
            rear = front
        } else {
            newNode.next = front
            front = newNode
        }
        size++
    }

    /**
     * Function to add new element to the rear end of queue
     *
     * @param data new element that has to be added to queue
     */
    fun addRear(data: T) {
        val newNode = Node<T>(data)

        if (front == null && rear == null) {
            front = newNode
            rear = front
        }
        if (front != null) {
            rear?.next = newNode
            rear = newNode
        }
        size++
    }

    /**
     * Function to remove the front element from queue
     *
     * @return front elemet of queue
     */
    fun removeFront(): T {

        if(isEmpty()) throw QueueIsEmptyException(" Queue is Empty ")

        if(size == 1){
            val oldNode = front
            front = null
            rear = null
            size--
            return oldNode?.data!!
        } else {
            val oldNode = front
            front = oldNode!!.next
            size--
            return oldNode.data!!
        }
    }

    /**
     * Function to remove rear element from queue
     *
     * @return rear element of queue
     */
    fun removeRear(): T {

        if(isEmpty()) throw QueueIsEmptyException(" Queue is Empty ")

        var temp = front
        var previousTemp : Node<T> ?= null

        while (temp!!.next != null) {
            previousTemp = temp
            temp = temp.next
        }
        if(previousTemp == null) {
            rear = null
            front = rear
            size--
            return temp.data!!
        } else {
            val oldNode = temp
            rear = previousTemp
            previousTemp.next = null
            size--
            return oldNode.data!!
        }

    }

    /**
     * Function to check whether queue is empty or not
     *
     * @return true if queue is empty
     */
    fun isEmpty() : Boolean {
        if(size == 0) return true
        return false
    }
}