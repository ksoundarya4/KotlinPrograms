/**
 * Object Oriented Program
 * @purpose Main function to initialize , shuffle
 * and distribute the deck of cards.
 * Print the cards of players
 * @file DeckOfCardsMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.deckofcards

fun main(){
    val deckOfCards =DeckOfCards()
    deckOfCards.initialize()
    deckOfCards.shuffle()
 val player =  deckOfCards.distribute()

     for(index in 0.until(player.size)){
         println("Player ${index+1}")
         println(player[index])
     }


}