package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class InventoryManager {

    private val objectMapper = jacksonObjectMapper()

    private val fileName = "/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/inventorymanager/inventory.json"
    val file = File(fileName)

    private val inventory: InventoryFactory = objectMapper.readValue(src = file)


    fun calculateRicePrice(): String {
        var riceJSONString = ""
        for (index in 0.until(inventory.rice!!.size)) {
            val totalPrice = inventory.rice[index].Weight!!.times(inventory.rice[index].Price!!)
            riceJSONString += objectMapper.writeValueAsString("${inventory.rice[index].Name} rice = $totalPrice")
        }
        return riceJSONString
    }

    fun calculateWheatPrice(): String {
        var wheatJSONString = ""
        for (index in 0.until(inventory.wheat!!.size)) {
            val totalPrice = inventory.wheat[index].Weight!!.times(inventory.wheat[index].Price!!)
            wheatJSONString += objectMapper.writeValueAsString("${inventory.wheat[index].Name} wheat = $totalPrice")
        }
        return wheatJSONString
    }

    fun calculatePulsesPrice(): String {
        var pulseJSONString = ""
        for (index in 0.until(inventory.pulses!!.size)) {
            val totalPrice = inventory.pulses[index].Weight!!.times(inventory.pulses[index].Price!!)
            pulseJSONString += objectMapper.writeValueAsString("${inventory.pulses[index].Name} = $totalPrice")
        }
        return pulseJSONString
    }

}

