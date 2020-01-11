package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class InventoryManager {

    val objectMapper = jacksonObjectMapper()

    val fileName = "/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/inventorymanager/inventory.json"
    val file = File(fileName)

    val inventory: InventoryFactory = objectMapper.readValue(src = file)


    fun calculateRicePrice() {
        for (index in 0.until(inventory.rice!!.size)) {
            val totalPrice = inventory.rice[index].Weight!!.times(inventory.rice[index].Price!!)
            println("${inventory.rice[index].Name} rice = $totalPrice")
        }
        println()
    }

    fun calculateWheatPrice() {
        for (index in 0.until(inventory.wheat!!.size)) {
            val totalPrice = inventory.wheat[index].Weight!!.times(inventory.wheat[index].Price!!)
            println("${inventory.wheat[index].Name} wheat = $totalPrice")
        }
        println()
    }

    fun calculatePulsesPrice() {
        for (index in 0.until(inventory.pulses!!.size)) {
            val totalPrice = inventory.pulses[index].Weight!!.times(inventory.pulses[index].Price!!)
            println("${inventory.pulses[index].Name} = $totalPrice")
        }
        println()
    }
}