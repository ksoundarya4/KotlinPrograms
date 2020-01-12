/**
 * Object Oriented Program
 * @purpose main function to execute Inventory Manager
 * @file InventoryManagerMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.inventorymanager

fun main() {
    val inventoryManager = InventoryManager()

    val jsonRicePrice = inventoryManager.calculateRicePrice()
    val jsonWheatPrice = inventoryManager.calculateWheatPrice()
    val jsonPulsePrice = inventoryManager.calculatePulsesPrice()
    println(" { $jsonRicePrice $jsonWheatPrice $jsonPulsePrice }")

}