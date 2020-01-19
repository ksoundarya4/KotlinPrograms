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

class AddressBook {

    var persons = ArrayList<Person>()
    var numberOfPerson = persons.size
    var file = File("/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/addressbook/addressBook.json")

    /**
     * Function to add people to Address Book
     */
    fun addPerson(person : Person) {
        persons.add(person)
    }

    /**
     * Function to get full name of person
     *
     * @param index of person ArrayList
     */
    fun getFullNameOfPerson(index: Int): String? {
        try {
            val person: Person = persons[index]
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
    fun updatePerson(person: Person) {
       persons.add(person)
    }

    /**
     * Function to remove a person from
     * Address Book.
     */
    fun removePerson(person : Person) {
       persons.remove(person)
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
            println(persons[index])
    }
}