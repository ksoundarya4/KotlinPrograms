/**
 * Design Pattern
 * @purpose To implement adapter design pattern
 * @file MediaPackage.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.adapter

/**
 * MediaPackage Interface
 */
interface MediaPackage {

    /**
     * @param fileName to play
     */
    fun playFile(fileName : String)
}