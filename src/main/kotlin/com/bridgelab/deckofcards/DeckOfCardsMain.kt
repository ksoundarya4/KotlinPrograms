package com.bridgelab.deckofcards
fun main(){
    val deckOfCards =DeckOfCards()
    deckOfCards.initialize()
    deckOfCards.shuffle()
    deckOfCards.distribute()
    println(deckOfCards.listOfCards)
}