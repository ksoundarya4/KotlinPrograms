package com.bridgelab.deckofcards

data class Card(val suit: String, val rank: String) {

    override fun toString(): String {
        return "${this.rank} of ${this.suit}"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Card) {
            if (other.suit == this.suit &&
                    other.rank == this.rank) return true
        }
        return false
    }

    override fun hashCode(): Int {
        return {this.rank+this.suit}.hashCode()
    }
}