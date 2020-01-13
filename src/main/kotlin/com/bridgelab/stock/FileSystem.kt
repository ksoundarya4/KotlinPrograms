/**
 * Object Oriented Program
 * @description To read and write json file.
 * @file FileSystem.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 13/01/2020
 */
package com.bridgelab.stock

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class FileSystem {
    val objectMapper = jacksonObjectMapper()

    /**
     * Function to write stock portfolio to stock.json file
     *
     * @param stockPortfolio class
     * @param file path of .json file
     */
    fun saveFile(stockPortfolio: StockPortfolio , file : File){
        try{
            objectMapper.writeValue(file,stockPortfolio)
        } catch (exception : Exception){
            exception.printStackTrace()
        }
    }

    /**
     * Function to read .json file
     *
     * @param file to be read
     * @return StockPortfolio
     */
    fun readFile(file : File) : StockPortfolio{
        return objectMapper.readValue(file)
    }
}