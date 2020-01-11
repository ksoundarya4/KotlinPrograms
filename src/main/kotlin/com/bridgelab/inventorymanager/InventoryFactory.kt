package com.bridgelab.inventorymanager

data class Item(val Name: String?,
                val Weight: Int?,
                val Price: Int?)

data class InventoryFactory(val rice: List<Item>?,
                     val wheat: List<Item>?,
                     val pulses: List<Item>?)