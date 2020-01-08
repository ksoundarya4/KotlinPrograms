/**
 * DataStructures
 * @description Read the Text from a file, split it into words and arrange it as Linked List.
 * Take a user input to search a Word in the List. If the Word is not found then add it to the list,
 * and if it found then remove the word from the List. In the end save the list into a file.
 * @file TestUnorderedList.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelabs.util

fun main() {

    val fileName = """C:\Users\soundarya k\IdeaProjects\BridgeLabz\src\com\bridgelabs\list\TestFile.txt"""

    val unorderedLinkedList = readFlie(fileName)
    println(unorderedLinkedList)

    println("Enter a word to be searched in list")
    val input = readLine().toString()

    if (unorderedLinkedList.search(input)) {
        println("Word found")
        unorderedLinkedList.remove(input)
    } else {
        println("Word not found")
        unorderedLinkedList.add(input)
    }
    println(unorderedLinkedList)

    val outputFile = "C:\\Users\\soundarya k\\IdeaProjects\\BridgeLabz\\src\\com\\bridgelabs\\list\\OutputFile.txt"
    writeFile(unorderedLinkedList, outputFile)

}