package com.bridgelabs.deque

import com.bridgelabs.list.Node

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
        var str = ""
        var temp : Node<T> ?= front

        while(temp != null){
            if(temp.next != null){
                str = str + temp.data.toString() + ","
            }
            if(temp.next == null){
                str = str + temp.data.toString()
            }
        }
        return "[$str]"
    }
}