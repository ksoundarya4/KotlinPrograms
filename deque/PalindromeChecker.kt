package com.bridgelabs.deque

fun main() {
    println("Enter a word to check whether it is palindrome or not")
    val input = readLine()!!.toString()

    var outputResult = ""
    val deque = Deque<Char>()

    for(index in 0.until(input.length)) {
        deque.addRear(input.get(index))
    }
    for(index in 0.until(deque.size)) {
      outputResult += deque.removeRear()
    }

    if(input.equals(outputResult)) println("$input is palindrome")
    if(!input.equals(outputResult)) println("$input is not palindrome")

}

