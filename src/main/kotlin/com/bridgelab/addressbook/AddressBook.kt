package com.bridgelab.addressbook

import java.io.File

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

    fun getFullNameOfPerson(index: Int): String {
        val person: Person = persons.get(index)
        return person.name.toString()
    }

    fun updatePerson(index: Int) {

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

    }

    fun removePerson(index: Int) {
        persons.removeAt(index)
    }

    fun sortByName() {
        persons.sortWith(compareBy { it.name.firstName })
    }

    fun sortByZip() {
        persons.sortWith(compareBy { it.address.zip })
    }

    fun printAll() {
        for (index in 0.until(persons.size))
            println(persons.get(index))
    }


}