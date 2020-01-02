package com.bridgelabs.sample

data class Node<T>(
    var data: T? = null,
    var next: Node<T>? = null,
    var position: Int? = null
)

