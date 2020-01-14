/**
 * Object Oriented Program
 * @description A Player class having list of cards.
 * @file Player.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.deckofcards

class Player {
    var PlayerCards = ArrayList<Card>()

    /**
     * Function to override toString function
     * To print list Of  Player Cards
     */
    override fun toString(): String {
        return PlayerCards.toString()
    }

    /**
     * Function to sort list of player cards based on suit.
     */
    fun sortBySuit() {
        PlayerCards.sortBy { it.suit }
    }
}




