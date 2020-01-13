/**
 * Custom Exception
 * @purpose To raise an exception when trying to access when stack is empty.
 * @file StackIsEmptyException.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelab.util

class StackIsEmptyException(message : String) : Throwable(message)