/**
 * Data Structures
 * @purpose main function to test working of Binary tree.
 * @file TestBinaryTree.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelabs.test

import com.bridgelabs.BinaryTree


fun main() {
    val tree = BinaryTree<Int>()
    val root = BinaryTree.Node(5)
    println(tree.traverseInOrder(root))
    tree.insert(root, 6)
    tree.insert(root, 2)
    tree.insert(root, 7)
    println(tree.traverseInOrder(root))
}