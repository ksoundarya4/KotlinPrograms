package com.bridgelabs.list

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