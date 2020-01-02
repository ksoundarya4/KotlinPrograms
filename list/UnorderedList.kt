package com.bridgelabs.sample

data class UnorderedList<T>(var head: Node<T>? = null , var last : Node<T>? = null , var size : Int = 0) {


    fun add(data: T) {
        val node = Node<T>(data)
        if (head == null && last == null) {
            head = node
            last = node
            size++
        }
        if (head != null) {
            last?.next = node
            last = node
            size++
        }
    }

    override fun toString(): String {
        var string: String = ""
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