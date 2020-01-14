/**
 * Object Oriented Programs
 * @description Card class which has suit and a rank
 * @file Card.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.deckofcards

data class Card(val suit: Suit, val rank: Rank) {

    /**
     * Function to override toString function
     * To print rank and suit of card
     */
    override fun toString(): String {
        return "${this.rank} of ${this.suit}"
    }

    /**
     * Function to override equals function
     */
    override fun equals(other: Any?): Boolean {
        if (other is Card) {
            if (other.suit == this.suit &&
                    other.rank == this.rank) return true
        }
        return false
    }

    /**
     * Function to override hashCode function
     */
    override fun hashCode(): Int {
        var result = suit.hashCode()
        result = 31 * result + rank.hashCode()
        return result
    }
}

