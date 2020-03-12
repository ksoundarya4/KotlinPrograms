/**
 * Design Pattern
 * @purpose To implement adapter design pattern
 * @file FormatAdapter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.adapter

class FormatAdapter(val media: MediaPackage) : MediaPlayer {

    /**
     * Function play uses playFile function
     * of MediaPackage to play
     *
     * @param fileName to play
     */
    override fun play(fileName: String) {
        println("USing adapter")
        media.playFile(fileName)
    }
}