/**
 * Data Structures
 * @description Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
 * where parentheses are used to order the performance of operations.
 * Ensure parentheses must appear in a balanced fashion.
 * @logic Write a Stack Class to push open parenthesis “(“
 * and pop closed parenthesis “)”. At the End of the Expression if the Stack is Empty
 * then the Arithmetic Expression is Balanced.
 * @file TestStack.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */
package com.bridgelabs.test

import com.bridgelabs.stack.Stack

fun main() {
    println("Enter an Arithmetic Expression to ensure it is balanced or not")

    val inputExpression: CharArray = readLine()!!.toCharArray()
    val stack = Stack<Char>()

    for (index in 0.until(inputExpression.size)) {
        if (inputExpression[index] == '(') stack.push(inputExpression[index])
        if (inputExpression[index] == ')') stack.pop()
    }
    if (stack.isEmpty()) println("Arithmetic Expression is balanced")
    if (!stack.isEmpty()) println("Aritmetic Expression is unbalanced")

}