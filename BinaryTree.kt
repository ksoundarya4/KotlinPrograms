package com.bridgelabs


class BinaryTree <T : Comparable<T>>{
    class Node<T : Comparable<T>>(
        var data: T? = null,
        var leftNode: Node<T>? = null,
        var rightNode: Node<T>? = null
    )

    fun insert(node : Node<T> , data : T){
        if(data < node.data!!) {
            if(node.leftNode != null){
                insert(node.leftNode!!, data)
            }else{
                node.leftNode = Node(data)
            }
        }else if(data > node.data!!) {
            if (node.rightNode != null) {
                insert(node.rightNode!!, data)
            } else {
                node.rightNode = Node(data)
            }
        }
    }
    fun traverseInOrder(node: Node<T>?) {
        if (node != null) {
            traverseInOrder(node.leftNode)
            System.out.print(" " + node.data)
            traverseInOrder(node.rightNode)
        }
    }
}

fun main() {
    val tree = BinaryTree<Int>()
    val root = BinaryTree.Node(5)
    println(tree.traverseInOrder(root))
    tree.insert(root,6)
    tree.insert(root,2)
    tree.insert(root,7)
    println(tree.traverseInOrder(root))
}