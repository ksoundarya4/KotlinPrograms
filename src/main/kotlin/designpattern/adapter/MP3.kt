/**
 * Design Pattern
 * @purpose To implement the adapter design pattern.
 * @file MP3.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.adapter

class MP3 : MediaPlayer{

    /**
     * play function to play mp3
     *
     * @param fileName to play
     */
    override fun play(fileName: String) {
        println("Playing Mp3 File $fileName")
    }
}