/**
 * Object Oriented Programs
 * @purpose To create Address Book Controller class
 * @file AddressBookController.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 10/01/2020
 */
package com.bridgelab.addressbook

import java.io.File

class AddressBookController {

    val fileSystem = FileSystem()
    var addressBook = AddressBook()

    fun addEntry() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter number of people to add")
        val numberOfPeople = readLine()!!.toInt()
        for (index in 0.until(numberOfPeople))
            addressBook.addPerson()
        fileSystem.saveFile(addressBook, addressBook.file)
    }

    fun removeEntry() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter person index to be removed")
        val index = readLine()!!.toInt()
        addressBook.removePerson(index)
        fileSystem.saveFile(addressBook, addressBook.file)
    }

    fun updateEntry() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter person index to be updated ")
        val index = readLine()!!.toInt()
        addressBook.updatePerson(index)
        fileSystem.saveFile(addressBook, addressBook.file)
    }

    fun viewFullName() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter person index to read his full name ")
        val index = readLine()!!.toInt()
        addressBook.getFullNameOfPerson(index)
    }

    fun numberOfPeople() {
        addressBook = fileSystem.readFile(addressBook.file)
        println(addressBook.persons.size)
    }

    fun printAddressBook() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Address Book")
        println("____________________________")
        addressBook.printAll()
        println("____________________________")
    }

    fun sortAddressBook() {
        println("Enter 1 to sort by name, 2 to sort by zipCode")
        val input = readLine()!!.toInt()
        if (input == 1) {
            addressBook = fileSystem.readFile(addressBook.file)
            addressBook.sortByName()
            fileSystem.saveFile(addressBook, addressBook.file)
        }
        if (input == 2) {
            addressBook = fileSystem.readFile(addressBook.file)
            addressBook.sortByZip()
            fileSystem.saveFile(addressBook, addressBook.file)
        }
    }

    fun createNewAddressBook() {
        println("Enter the file path")
        val fileName = readLine()!!.toString()
        val file = File(fileName)
        println("Enter number of people to add")
        val numberOfPeople = readLine()!!.toInt()
        for (index in 0.until(numberOfPeople))
            addressBook.addPerson()
        fileSystem.saveFile(addressBook, file)
    }

}

