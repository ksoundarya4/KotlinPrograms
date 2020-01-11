package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun main() {
    val inventoryManager = InventoryManager()

    val objectMapping = jacksonObjectMapper()

    val jsonRicePrice = inventoryManager.calculateRicePrice()
    val jsonWheatPrice = inventoryManager.calculateWheatPrice()
    val jsonPulsePrice = inventoryManager.calculatePulsesPrice()
    println(" { $jsonRicePrice $jsonWheatPrice $jsonPulsePrice }")

}