package com.bridgelab.addressbook

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File
import java.lang.Exception

class FileSystem {

    val objectMapper = jacksonObjectMapper()

    fun saveFile(addressBook: AddressBook, file: File) {
        try {

            objectMapper.writeValue(file, addressBook)
        } catch (exception: Exception) {
            exception.stackTrace
        }
    }

    fun readFile(file: File): AddressBook {
        return objectMapper.readValue(file)
    }
}