/**
 * Object Oriented Programs
 * @purpose To create Address Book Application class
 * @file AddressBookApplication.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 10/01/2020
 */
package com.bridgelab.addressbook

class AddressBookController {

    val fileSystem = FileSystem()
    var addressBook = AddressBook()

    /**
     * Function to controller Address Book
     */
    fun addressBookController() {

        println("Enter the following choice to perform")
        println("Enter choice 1 to add person to address Book")
        println("Enter choice 2 to remove person from address Book")
        println("Enter choice 3 to update address book")
        println("Enter choice 4 to view any persons full name")
        println("Enter choice 5 to know number of people in address Book")
        println("Enter choice 6 to print address book")
        println("Enter choice 7 to sort addressbook")

        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                addressBook = fileSystem.readFile(addressBook.file)
                println("Enter number of people to add")
                val numberOfPeople = readLine()!!.toInt()
                for (index in 0.until(numberOfPeople))
                    addressBook.addPerson()
                fileSystem.saveFile(addressBook, addressBook.file)
            }
            2 -> {
                addressBook = fileSystem.readFile(addressBook.file)
                println("Enter person index to be removed")
                val index = readLine()!!.toInt()
                addressBook.removePerson(index)
                fileSystem.saveFile(addressBook, addressBook.file)
            }
            3 -> {
                addressBook = fileSystem.readFile(addressBook.file)
                println("Enter person index to be updated ")
                val index = readLine()!!.toInt()
                addressBook.updatePerson(index)
                fileSystem.saveFile(addressBook, addressBook.file)
            }
            4 -> {
                addressBook = fileSystem.readFile(addressBook.file)
                println("Enter person index to read his full name ")
                val index = readLine()!!.toInt()
                addressBook.getFullNameOfPerson(index)
            }
            5 -> {
                addressBook = fileSystem.readFile(addressBook.file)
                println(addressBook.persons.size)
            }

            6 -> {
                addressBook = fileSystem.readFile(addressBook.file)
                println("Adress Book")
                addressBook.printAll()
            }
             7 -> {
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
            else -> {
                println("Invalid Choice ")
            }
        }
    }
}

