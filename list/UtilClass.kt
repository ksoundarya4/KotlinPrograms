/**
 * UtilClass
 *@purpose Contains all the reusable functions
 * @file UtilClass.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.list

import java.io.File
import java.io.PrintWriter

/**
 * Function to read contents of file
 *
 * @param fileName To read the content from.
 * @return content of file using unorderedLinkedList.
 */
fun readFlie(fileName: String): UnorderedLinkedList<String> {
    val file = File(fileName)
    val bufferReader = file.bufferedReader()
    val text: String = bufferReader.readLine()

    val unorderedLinkedList = UnorderedLinkedList<String>()
    val stringList = text.split(" ")

    for (index in 0.until(stringList.size)) {
        unorderedLinkedList.add(stringList[index])
    }
    return unorderedLinkedList
}

/**
 * Function to write the content into file.
 *
 * @param unorderedLinkedList contains elements that should be written to a file.
 * @param fileName contains path to which content should be written.
 */
fun writeFile(unorderedLinkedList: UnorderedLinkedList<String>, fileName: String) {
    var outputString = ""

    for (index in 0.until(unorderedLinkedList.size)) {
        outputString += unorderedLinkedList.get(index) + " "
    }

    val writer = PrintWriter(fileName)
    writer.append(outputString)
    writer.close()
}

