package com.bridgelab.deckofcards

import com.bridgelabs.queue.Queue

fun main() {

    val deckOfCards = DeckOfCards()
    deckOfCards.initialize()
    deckOfCards.shuffle()
    val players = deckOfCards.distribute()

    val playerQueue = Queue<Player>()

    for(player in players){
        player.sortBysuit()
        playerQueue.enequeue(player)
    }

    println(playerQueue)
}