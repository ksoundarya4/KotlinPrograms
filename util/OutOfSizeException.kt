/**
 * Custom Exception
 * @purpose To raise an exception when trying to access beyond linked list size.
 * @file OutOfSizeException.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 02/01/2020
 */
package com.bridgelabs.util

class OutOfSizeException(message : String) : Throwable(message)