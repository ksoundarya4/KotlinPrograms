package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class InventoryManager {

    val objectMapper = jacksonObjectMapper()

    val fileName = "/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/inventorymanager/inventory.json"
    val file = File(fileName)

    val inventory: InventoryFactory = objectMapper.readValue(src = file)


    fun calculateRicePrice(): String {
        var ricePrice: String = ""
        for (index in 0.until(inventory.rice!!.size)) {
            val totalPrice = inventory.rice[index].Weight!!.times(inventory.rice[index].Price!!)
            ricePrice += "${inventory.rice[index].Name} rice = $totalPrice"
        }
        return ricePrice
    }

    fun calculateWheatPrice(): String {
        var wheatPrice: String = ""
        for (index in 0.until(inventory.wheat!!.size)) {
            val totalPrice = inventory.wheat[index].Weight!!.times(inventory.wheat[index].Price!!)
            wheatPrice += "${inventory.wheat[index].Name} wheat = $totalPrice"
        }
        return wheatPrice
    }

    fun calculatePulsesPrice(): String {
        var pulsesPrice = ""
        for (index in 0.until(inventory.pulses!!.size)) {
            val totalPrice = inventory.pulses[index].Weight!!.times(inventory.pulses[index].Price!!)
            pulsesPrice += "${inventory.pulses[index].Name} = $totalPrice"
        }
        return pulsesPrice
    }
}