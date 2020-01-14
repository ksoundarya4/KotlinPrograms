/**
 *Object Oriented Programs
 * @purpose To create Address Book Application
 * @file AddressBookApplication.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 10/02/2020
 */
package com.bridgelab.addressbook

fun main() {

    val controller = AddressBookController()

    println("Enter the following choice to perform")
    println("Enter choice 1 to add person to address Book")
    println("Enter choice 2 to remove person from address Book")
    println("Enter choice 3 to update address book")
    println("Enter choice 4 to view any persons full name")
    println("Enter choice 5 to know number of people in address Book")
    println("Enter choice 6 to print address book")
    println("Enter choice 7 to sort address book")
    println("Enter choice 8 to create new address book")

    when (readLine()!!.toInt()) {
        1 -> controller.addEntry()
        2 -> controller.removeEntry()
        3 -> controller.updateEntry()
        4 -> controller.viewFullName()
        5 -> controller.numberOfPeople()
        6 -> controller.printAddressBook()
        7 -> controller.sortAddressBook()
        8 -> controller.createNewAddressBook()
        else -> println("Inavlid choice")
    }
}