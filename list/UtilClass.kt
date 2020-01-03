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

object UtilClass

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

fun writeFile(unorderedLinkedList: UnorderedLinkedList<String> , fileName: String ){
    var outputString = ""

    for(index in 0.until(unorderedLinkedList.size)) {
        outputString += unorderedLinkedList.get(index) + " "
    }

    val writer = PrintWriter(fileName)
    writer.append(outputString)
    writer.close()
}

