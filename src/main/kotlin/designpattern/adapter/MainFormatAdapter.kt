/**
 * Design Pattern
 * @purpose To implement adapter design pattern
 * @file MainFormatAdapter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.adapter

fun main(){
    var player  : MediaPlayer = MP3()
    player.play("file.mp3")

    player = FormatAdapter(MP4())
    player.play("file.mp4")

    player = FormatAdapter(VLC())
    player.play("flie.avi")
}