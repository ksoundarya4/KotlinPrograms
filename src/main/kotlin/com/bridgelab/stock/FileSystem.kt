/**
 * Object Oriented Program
 */
package com.bridgelab.stock

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class FileSystem {
    val objectMapper = jacksonObjectMapper()

    fun saveFile(stockPortfolio: StockPortfolio , file : File){
        try{
            objectMapper.writeValue(file,stockPortfolio)
        } catch (exception : Exception){
            exception.printStackTrace()
        }
    }

    fun readFile(file : File) : StockPortfolio{
        return objectMapper.readValue(file)
    }
}