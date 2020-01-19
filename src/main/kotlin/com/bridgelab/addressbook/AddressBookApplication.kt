/**
 *Object Oriented Programs
 * @purpose To create Address Book Application
 * @file AddressBookApplication.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 10/02/2020
 */
package com.bridgelab.addressbook

import com.bridgelabs.util.UtilClass
import kotlin.system.exitProcess

fun main() {
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
                val newPerson = UtilClass.readPersonInput()
                controller.addEntry(newPerson)
            }
            2 -> {println("Enter person id to remove")
                val id = readLine()!!.toInt()
             val person = UtilClass.searchPersonById(id)
                if(person != null)
                    controller.removeEntry(person)
                else {
                    println("Person with $id not found")
                }
            }
            3 -> {println("Enetr person id to update")
                val id = readLine()!!.toInt()
                val person = UtilClass.searchPersonById(id)
                if(person != null)
                    controller.updateEntry(person)
                else println("Person with $id not foound to update")
            }
            4 -> controller.viewFullName()
            5 -> controller.numberOfPeople()
            6 -> controller.printAddressBook()
            7 -> controller.sortAddressBook()
            8 -> controller.createNewAddressBook(UtilClass.readPersonInput())
            9 -> exitProcess(0)
            else -> println("Inavlid choice")
        }
    } while (choice < 10)
}