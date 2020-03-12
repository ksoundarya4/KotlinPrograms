/**
 * Design Pattern
 * @purpose To implement proxy design pattern
 * @file NormalFile.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.proxy

/**
 * NormalFile class implementing File
 */
class NormalFile : File {

    /**
     * Function to read file.
     *
     * @param name File name to read.
     */
    override fun read(name: String) {
        println("Reading file $name")
    }
}