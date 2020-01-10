package com.bridgelab.addressbook

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

class Entry {
    val personCollection = ArrayList<Person>()

    fun personInfo() : Person {
        val person = Person(
            name = Name(getFirstName(), getLastName()),
            address = Address(
                gethouseNumber(), getStreet(),
                getLoaclity(), getCity(),
                getState(), getZip()
            ),
            phoneNumber = getPhoneNumber()
        )
        return person
    }

    fun getFirstName(): String {
        println("Enter person's first name")
        return readLine()!!.toString()
    }

    fun getLastName(): String {
        println("Enter person's last name")
        return readLine()!!.toString()
    }

    fun gethouseNumber(): String {
        println("Address : Enter house number")
        return readLine()!!.toString()
    }

    fun getStreet(): String {
        println("Address : Enter Street name")
        return readLine()!!.toString()
    }

    fun getLoaclity(): String {
        println("Address : Enter Locality name")
        return readLine()!!.toString()
    }

    fun getCity(): String {
        println("Address : Enter City name")
        return readLine()!!.toString()
    }

    fun getState(): String {
        println("Address : Enter State name")
        return readLine()!!.toString()
    }

    fun getZip(): String {
        println("Address : Enter Zip code")
        return readLine()!!.toString()
    }

    fun getPhoneNumber(): String {
        println("Enter Phone number")
        return readLine()!!.toString()
    }



}

fun main() {
    val objMapper = jacksonObjectMapper()
}
