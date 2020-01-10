/**
 * Object Oriented Programs
 * @purpose To create a AddressBook that stores person information
 * @file AddressBook.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 07/01/2020
 */
package com.bridgelab.addressbook

import java.io.File
import java.lang.IndexOutOfBoundsException

class AddressBook() {


    var persons = ArrayList<Person>()
        get
        private set

    var numberOfPerson = 0
        get
        set

    var file = File("/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/addressbook/addressBook.json")
        get
        private set

    /**
     * Function to add people to Address Book
     */
    fun addPerson() {

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

        persons.add(Person(
                id = id,
                name = Name(firstName, lastName),
                address = Address(houseNumber, street, locality, city, state, zipCode
                ),
                phoneNumber = phoneNumber
        ))
        numberOfPerson++

    }

    /**
     * Function to get full name of person
     *
     * @param index of person ArrayList
     */
    fun getFullNameOfPerson(index: Int): String? {
        try {
            val person: Person = persons.get(index)
            return person.name.toString()
        } catch (exception: IndexOutOfBoundsException) {
            println("First index  = 0 and last index = ${numberOfPerson - 1}")
            exception.stackTrace
        }
        return null
    }

    /**
     * Function to update person info based on ArrayIndex
     */
    fun updatePerson(index: Int) {
        try {
            val id = readLine()!!.toInt()
            val firstName = readLine()!!.toString()
            val lastName = readLine()!!.toString()
            val houseNumber = readLine()!!.toString()
            val street = readLine()!!.toString()
            val locality = readLine()!!.toString()
            val city = readLine()!!.toString()
            val state = readLine()!!.toString()
            val zipCode = readLine()!!.toString()
            val phoneNumber = readLine()!!.toString()

            persons.set(index, Person(
                    id = id,
                    name = Name(firstName, lastName),
                    address = Address(houseNumber, street, locality, city, state, zipCode
                    ),
                    phoneNumber = phoneNumber))

        } catch (exception: IndexOutOfBoundsException) {
            println("First index  = 0 and last index = ${numberOfPerson - 1}")
            exception.stackTrace
        }
    }

    /**
     * Function to remove a person from
     * Address Book based on Array Index
     */
    fun removePerson(index: Int) {
        try {
            persons.removeAt(index)
        } catch (exception: IndexOutOfBoundsException) {
            println("First index  = 0 and last index = ${numberOfPerson - 1}")
            exception.stackTrace
        }
    }

    /**
     *
     * function to sort AddressBook by person name
     */
    fun sortByName() {
        persons.sortWith(compareBy { it.name.firstName })
    }

    /**
     *
     * function to sort AddressBook by
     * person address zip code
     */
    fun sortByZip() {
        persons.sortWith(compareBy { it.address.zip })
    }

    /**
     * Function to print all persons details
     * present in Address Book
     */
    fun printAll() {
        for (index in 0.until(persons.size))
            println(persons.get(index))
    }
}