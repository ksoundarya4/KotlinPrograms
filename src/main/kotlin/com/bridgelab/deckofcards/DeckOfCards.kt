package com.bridgelab.deckofcards

class DeckOfCards {

    private val suite: Array<String> = arrayOf("Clubs", "Diamonds", "Hearts", "Spades")
    private val rank: Array<String> = arrayOf("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King")
    private val numberOfCards = suite.size * rank.size

   var listOfCards = ArrayList<Card>()

    fun initialize() {
        for (indexI in 0.until(suite.size)) {
            for (indexJ in 0.until(rank.size)) {
                listOfCards.add(Card(suite[indexI], rank[indexJ]))
            }
        }
    }

    fun shuffle(){
        for(index in 0.until(numberOfCards)){
            val randomNumber = index + (Math.random() * (numberOfCards-index)).toInt()
            val temp = listOfCards[randomNumber]
            listOfCards[randomNumber] = listOfCards[index]
            listOfCards[index] = temp
        }
    }

    fun distribute() {
        for(indexI in 0.until(4)){
            println("Person ${indexI+1} : ")
            println()
            for(indexJ in 0.until(9)){
                println(listOfCards[indexI+indexJ*4])
            }
            println()
        }
    }
}
