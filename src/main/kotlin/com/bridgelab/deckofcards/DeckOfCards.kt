package com.bridgelab.deckofcards

class DeckOfCards {

    private val suite: Array<String> = arrayOf("Clubs", "Diamonds", "Hearts", "Spades")
    private val rank: Array<String> = arrayOf("Ace", "King", "Queen", "jack", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    private val numberOfCards = suite.size * rank.size

    var list = ArrayList<Card>()

    fun initialize() {
        for (indexI in 0.until(suite.size)) {
            for (indexJ in 0.until(rank.size)) {
                list.add(Card(suite[indexI], rank[indexJ]))
            }
        }
    }

    fun shuffle() {
        for (index in 0.until(numberOfCards)) {
            val randomNumber = index + (Math.random() * (numberOfCards - index)).toInt()
            val temp = list[randomNumber]
            list[randomNumber] = list[index]
            list[index] = temp
        }
    }

    fun distribute(): ArrayList<Player> {
        val players = ArrayList<Player>()
        for (indexI in 0.until(4)) {
            val player = Player()
            for (indexJ in 0.until(9)) {
                player.listOfPlayerCards.add(list[indexI + indexJ * 4])
            }
            players.add(player)
        }
        return players
    }
}
