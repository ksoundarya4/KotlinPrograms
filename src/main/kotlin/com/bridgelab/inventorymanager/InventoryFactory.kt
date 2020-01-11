package com.bridgelab.inventorymanager

data class Rice(val Name: String?,
                val Weight: Int?,
                val Price: Int?)

data class Wheat(val Name: String?,
                 val Weight: Int?,
                 val Price: Int?)

data class Pulses(val Name: String?,
                  val Weight: Int?,
                  val Price: Int?)

data class InventoryFactory(val rice: List<Rice>?,
                     val wheat: List<Wheat>?,
                     val pulses: List<Pulses>?) {

 }