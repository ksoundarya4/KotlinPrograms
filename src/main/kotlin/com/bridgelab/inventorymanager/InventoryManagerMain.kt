package com.bridgelab.inventorymanager


fun main() {
    val inventoryManager = InventoryManager()

    val jsonRicePrice = inventoryManager.calculateRicePrice()
    val jsonWheatPrice = inventoryManager.calculateWheatPrice()
    val jsonPulsePrice = inventoryManager.calculatePulsesPrice()
    println(" { $jsonRicePrice $jsonWheatPrice $jsonPulsePrice }")

}