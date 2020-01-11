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

    fun calculateRicePrice() {
        for (index in 0.until(rice!!.size)) {
            val totalPrice = rice[index].Weight!!.times(rice[index].Price!!)
            println("${rice[index].Name} rice = $totalPrice")
        }
        println()
    }

    fun calculateWheatPrice() {
        for (index in 0.until(wheat!!.size)) {
            val totalPrice = wheat[index].Weight!!.times(wheat[index].Price!!)
            println("${wheat[index].Name} wheat = $totalPrice")
        }
        println()
    }

    fun calculatePulsesPrice() {
        for (index in 0.until(pulses!!.size)) {
            val totalPrice = pulses[index].Weight!!.times(pulses[index].Price!!)
            println("${pulses[index].Name} = $totalPrice")
        }
        println()
    }
}