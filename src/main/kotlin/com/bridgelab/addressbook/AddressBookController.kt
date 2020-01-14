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

    private val fileSystem = FileSystem()
    private var addressBook = AddressBook()

    /**
     * Function to add people to Address Book
     */
    fun addEntry() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter number of people to add")
        val numberOfPeople = readLine()!!.toInt()
        for (index in 0.until(numberOfPeople))
            addressBook.addPerson()
        fileSystem.saveFile(addressBook, addressBook.file)
    }

    /**
     * Function to remove a person from Address Book
     */
    fun removeEntry() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter person index to be removed")
        val index = readLine()!!.toInt()
        addressBook.removePerson(index)
        fileSystem.saveFile(addressBook, addressBook.file)
    }

    /**
     * Function to update person info in Address Book
     */
    fun updateEntry() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter person index to be updated ")
        val index = readLine()!!.toInt()
        addressBook.updatePerson(index)
        fileSystem.saveFile(addressBook, addressBook.file)
    }

    /**
     *Function to get full name of person from Address Book
     */
    fun viewFullName() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Enter person index to read his full name ")
        val index = readLine()!!.toInt()
        addressBook.getFullNameOfPerson(index)
    }

    /**
     *Function to know number of people in Address Book
     */
    fun numberOfPeople() {
        addressBook = fileSystem.readFile(addressBook.file)
        println(addressBook.persons.size)
    }

    /**
     *Function to print Address Book
     */
    fun printAddressBook() {
        addressBook = fileSystem.readFile(addressBook.file)
        println("Address Book")
        println("____________________________")
        addressBook.printAll()
        println("____________________________")
    }

    /**
     * Function to sort Address Book based on
     * person name or on zip code
     */
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

    /**
     * Function to create new Address Book
     */
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

