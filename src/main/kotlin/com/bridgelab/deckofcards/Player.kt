package com.bridgelab.deckofcards

class Player {
    var listOfPlayerCards = ArrayList<Card>()

    override fun toString(): String {
        return listOfPlayerCards.toString()
    }

    fun sortBysuit() {
      listOfPlayerCards.sortBy { it.suit }
        }

    }




