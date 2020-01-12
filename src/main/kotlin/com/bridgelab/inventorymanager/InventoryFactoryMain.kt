/**
 * Object Oriented Program
 * @description Create Inventory Object from JSON.
 * Calculate the value for every Inventory.
 * Create the JSON from Inventory Object and
 * output the JSON String.
 * @file InventoryFactoryMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

fun main() {
    val objectMapper = jacksonObjectMapper()

    val fileName = "/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/inventorymanager/inventory.json"
    val file = File(fileName)

    val inventory  : InventoryFactory = objectMapper.readValue(src = file)

    val jsonString = objectMapper.writeValueAsString(inventory)
    println(jsonString)
}