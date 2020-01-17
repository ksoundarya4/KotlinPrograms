/**
 * Design Pattern
 * @purpose To implement adapter design pattern.
 * @file MediaPlayer.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/20202
 */
package designpattern.adapter

/**
 * MediaPlayer interface
 */
interface MediaPlayer {

    /**
     * @param fileName to play
     */
    fun play(fileName : String)
}