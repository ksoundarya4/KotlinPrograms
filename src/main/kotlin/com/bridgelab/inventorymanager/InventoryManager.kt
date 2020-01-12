/**
 * Object Oriented Program
 * @description The Inventory Manager will use InventoryFactory
 * to create Inventory Object from JSON. The InventoryManager will
 * call each Inventory Object in its list to calculate the Inventory
 * Price and then call the Inventory Object to return the JSON String.
 * @file InventoryManager.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class InventoryManager {

    private val objectMapper = jacksonObjectMapper()

    private val fileName = "/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/inventorymanager/inventory.json"
    val file = File(fileName)

    private val inventory: InventoryFactory = objectMapper.readValue(src = file)

    /**
     * Function to calculate price of each rice type.
     */
    fun calculateRicePrice(): String {
        var riceJSONString = ""
        for (index in 0.until(inventory.rice!!.size)) {
            val totalPrice = inventory.rice[index].Weight!!.times(inventory.rice[index].Price!!)
            riceJSONString += objectMapper.writeValueAsString("${inventory.rice[index].Name} rice = $totalPrice")
        }
        return riceJSONString
    }

    /**
     * Function to calculate price of each wheat type.
     */
    fun calculateWheatPrice(): String {
        var wheatJSONString = ""
        for (index in 0.until(inventory.wheat!!.size)) {
            val totalPrice = inventory.wheat[index].Weight!!.times(inventory.wheat[index].Price!!)
            wheatJSONString += objectMapper.writeValueAsString("${inventory.wheat[index].Name} wheat = $totalPrice")
        }
        return wheatJSONString
    }

    /**
     * Function to calculate price of each pulse type.
     */
    fun calculatePulsesPrice(): String {
        var pulseJSONString = ""
        for (index in 0.until(inventory.pulses!!.size)) {
            val totalPrice = inventory.pulses[index].Weight!!.times(inventory.pulses[index].Price!!)
            pulseJSONString += objectMapper.writeValueAsString("${inventory.pulses[index].Name} = $totalPrice")
        }
        return pulseJSONString
    }

}

