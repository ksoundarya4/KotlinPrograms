package com.bridgelab.deckofcards

fun main() {

    val deckOfCards = DeckOfCards()
    println(deckOfCards.listOfCards)
    deckOfCards.initialize()
    println(deckOfCards.listOfCards)
    println(deckOfCards.listOfCards.size)
    deckOfCards.shuffle()
    println(deckOfCards.listOfCards)
    deckOfCards.distribute()
}