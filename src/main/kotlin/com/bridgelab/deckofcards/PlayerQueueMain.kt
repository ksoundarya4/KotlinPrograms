/**
 * Object Oriented Program
 * @description To maintain a Player cards in a Queue without
 * using Collection library.
 * @file PlayerQueueMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.deckofcards

import com.bridgelabs.queue.Queue

fun main() {

    val deckOfCards = DeckOfCards()
    deckOfCards.initialize()
    deckOfCards.shuffle()

    println("Enter the number of players")
    val numberOfPlayers = readLine()!!.toInt()

    val players = deckOfCards.distribute(numberOfPlayers)

    val playerQueue = Queue<Player>()

    for (player in players) {
        player.sortBySuit()
        playerQueue.enequeue(player)
    }
    println(playerQueue)
}