package com.bridgelabs.queue

import com.bridgelabs.list.Node

data class Queue<T>(
    private var head: Node<T>? = null,
    private var tail: Node<T>? = null,
    private var size: Int = 0
) {

}