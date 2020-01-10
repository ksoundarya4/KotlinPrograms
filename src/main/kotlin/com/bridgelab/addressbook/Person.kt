/**
 * Object Oriented Programs
 * @description Person class containing person name,
 * person address and person phone number.
 * @file Person.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelab.addressbook

data class Person(
    var name: Name,
    var address: Address,
    var phoneNumber: String
) {

    /**
     *Function that overrides equals() function
     */
    override fun equals(other: Any?): Boolean {
        if (other is Person) {
            if (other.name == this.name &&
                other.address == this.address &&
                other.phoneNumber == this.phoneNumber
            )
                return true
        }
        return false
    }

    /**
     *Function that overrides toString() function
     */
    override fun toString(): String {
        return "Name : $name \nAddress : $address \nPhoneNumber : $phoneNumber"
    }

    /**
     *Function that overrides hashCode() function
     */
    override fun hashCode(): Int {
        return { name.hashCode() + address.hashCode() + phoneNumber.hashCode() }.hashCode()
    }

}
