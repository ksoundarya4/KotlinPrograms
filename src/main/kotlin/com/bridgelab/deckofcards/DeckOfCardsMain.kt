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