/**
 * Design Pattern
 * @purpose To implement proxy design pattern
 * @file File.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.proxy

/**
 * File Interface
 */
interface File {

    /**
     * Function to read file.
     *
     * @param name file name to read.
     */
    fun read(name : String)
}