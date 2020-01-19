/**
 * Object Oriented Program
 * @description Write a Program DeckOfCards, to initialize deck of cards
 * having suit ("Clubs", "Diamonds", "Hearts", "Spades") &
 * Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players
 * and Print the Cards the received by the 4 Players using 2D Array.
 * @file DeckOfCards.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.deckofcards

class DeckOfCards {

    private val suite: Array<Suit> = arrayOf(Suit.CLUB, Suit.DIAMOND, Suit.HEART, Suit.SPADE)

    private val rank: Array<Rank> = arrayOf(Rank.Ace, Rank.One, Rank.Two, Rank.Three, Rank.Four,
            Rank.Five, Rank.Six, Rank.Seven, Rank.Eight, Rank.Nine, Rank.Ten, Rank.Jack, Rank.Queen,
            Rank.King)

    private val numberOfCards = suite.size * rank.size

    var list = ArrayList<Card>()

    /**
     * Function to initialize listOfCards
     */
    fun initialize() {
        for (indexI in 0.until(suite.size)) {
            for (indexJ in 0.until(rank.size)) {
                list.add(Card(suite[indexI], rank[indexJ]))
            }
        }
    }

    /**
     * Function to shuffle listOfCards
     */
    fun shuffle() {
        for (index in 0.until(numberOfCards)) {
            val randomNumber = index + (Math.random() * (numberOfCards - index)).toInt()
            val temp = list[randomNumber]
            list[randomNumber] = list[index]
            list[index] = temp
        }
    }

    /**
     * Function to distribute 9 cards to 4 players
     *
     * @return ArrayList of Players
     */
    fun distribute(NumberOfPlayers : Int): ArrayList<Player> {
        val players = ArrayList<Player>()
        for (indexI in 0.until(NumberOfPlayers)) {
            val player = Player()
            for (indexJ in 0.until(9)) {
                player.PlayerCards.add(list[indexI + indexJ * 4])
            }
            players.add(player)
        }
        return players
    }
}
