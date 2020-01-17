/**
 * Design Pattern
 * @purpose To implement adapter design pattern.
 * @file MP4.kt
 * @version 1.0
 * @since 17/01/20202
 */
package designpattern.adapter


class MP4 : MediaPackage {

    /**
     * Function to play MP4.
     *
     * @param fileName to play.
     */
    override fun playFile(fileName: String) {
        println("Playing MP4 File $fileName")
    }
}