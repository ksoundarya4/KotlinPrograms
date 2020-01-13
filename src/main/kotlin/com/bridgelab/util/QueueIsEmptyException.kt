/**
 * Custom Exception
 * @purpose To raise an exception when an queue is emptys
 * @file QuequeIsEmptyException.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 03/01/2020
 */

package com.bridgelab.util

class QueueIsEmptyException(message : String) : Throwable(message)