/**
 * Object Oriented Program
 * @description Inventory factor that contains list of items.
 * @file InventoryFactory.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.inventorymanager

data class Item(val Name: String?,
                val Weight: Int?,
                val Price: Int?)

data class InventoryFactory(val rice: List<Item>?,
                     val wheat: List<Item>?,
                     val pulses: List<Item>?)