/**
 *Object Oriented Programs
 * @purpose To create Address Book Application
 * @file AddressBookApplication.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 10/02/2020
 */
package com.bridgelab.addressbook

import kotlin.system.exitProcess

class AddressBookApplication {

    val addressBook = AddressBook()

    fun readPersonInput(): Person {
        println("Enter Person Details")

        println("Enter person id")
        val id = readLine()!!.toInt()

        println("Enter first name")
        val firstName = readLine()!!.toString()

        println("Enter last name")
        val lastName = readLine()!!.toString()

        println("Enter Person Address")
        println("Enter house number")
        val houseNumber = readLine()!!.toString()

        println("Enter street")
        val street = readLine()!!.toString()

        println("Enter locality")
        val locality = readLine()!!.toString()

        println("Enter city")
        val city = readLine()!!.toString()

        println("Enter state")
        val state = readLine()!!.toString()

        println("Enter zip code")
        val zipCode = readLine()!!.toString()

        println("Enter phone number")
        val phoneNumber = readLine()!!.toString()

        val person = (Person(
                id = id,
                name = Name(firstName, lastName),
                address = Address(houseNumber, street, locality, city, state, zipCode
                ),
                phoneNumber = phoneNumber
        ))
        return person
    }

    fun removePerson(): Person {

        println("Eneter index to remove a person")
        val input = readLine()!!.toInt()

        val person = addressBook.persons[input]
        return person
    }

    fun updatePerson(): Person {

        println("Enter index to update person")
        val input = readLine()!!.toInt()

        val person = addressBook.persons[input]

        println("Enter 1 to update person address")
        println("Enter 2 to update person phoneNumber")

        when (readLine()!!.toInt()) {
            1 -> {
                println("Enter house number")
                val houseNumber = readLine()!!.toString()

                println("Enter street")
                val street = readLine()!!.toString()

                println("Enter locality")
                val locality = readLine()!!.toString()

                println("Enter city")
                val city = readLine()!!.toString()

                println("Enter state")
                val state = readLine()!!.toString()

                println("Enter zip code")
                val zipCode = readLine()!!.toString()

                person.address.houseNumber = houseNumber
                person.address.street = street
                person.address.locality = locality
                person.address.city = city
                person.address.state = state
                person.address.zip = zipCode
            }
            2 -> {
                println("Enter phone number")
                val phoneNumber = readLine()!!.toString()

                person.phoneNumber = phoneNumber
            }
            else -> println("Enter valid choice")
        }
        return person
    }

}

fun main() {

    val application = AddressBookApplication()
    val controller = AddressBookController()
    do {
        println("Enter the following choice to perform")
        println("Enter choice 1 to add person to address Book")
        println("Enter choice 2 to remove person from address Book")
        println("Enter choice 3 to update address book")
        println("Enter choice 4 to view any persons full name")
        println("Enter choice 5 to know number of people in address Book")
        println("Enter choice 6 to print address book")
        println("Enter choice 7 to sort address book")
        println("Enter choice 8 to create new address book")
        println("Enter choice 9 to exit")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                val newPerson = application.readPersonInput()
                controller.addEntry(newPerson)
            }
            2 -> controller.removeEntry(application.removePerson())
            3 -> controller.updateEntry(application.updatePerson())
            4 -> controller.viewFullName()
            5 -> controller.numberOfPeople()
            6 -> controller.printAddressBook()
            7 -> controller.sortAddressBook()
            8 -> controller.createNewAddressBook(application.readPersonInput())
            9 -> exitProcess(0)
            else -> println("Inavlid choice")
        }
    } while (choice > 9)
}