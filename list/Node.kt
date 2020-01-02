/**
 * DataStructure Programs
 * @purpose To implement List without using Collection library
 * @file Node.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelabs.list

/**
 * Creating Generic Node class that has data of generic type ,
 * pointer to next Node called next and position of the Node.
 */
data class Node<T>(
    var data: T? = null,
    var next: Node<T>? = null,
    var position: Int? = null
)

