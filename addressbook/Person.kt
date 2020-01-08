package com.bridgelabs.addressbook

data class Person(
    val name: Name? = null,
    val address: Address? = null,
    val phoneNumber: String? = null
) {
}