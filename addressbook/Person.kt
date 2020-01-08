/**
 * Object Oriented Programs
 * @description Person class containing person name,
 * person address and person phone number.
 * @file Person.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelabs.addressbook

data class Person(
    var name: Name? = null,
    var address: Address? = null,
    var phoneNumber: String? = null
) {

    /**
     *Function that overrides equals() function
     */
    override fun equals(other: Any?): Boolean {
        if (other is Person) {
            if (other.name!!.equals(this.name) &&
                other.address!!.equals(this.address) &&
                other.phoneNumber.equals(this.phoneNumber)
            )
                return true
        }
        return false
    }

    /**
     *Function that overrides toString() function
     */
    override fun toString(): String {
        return "Name : $name \n Address : $address \n PhoneNumber : $phoneNumber"
    }

    /**
     *Function that overrides hashCode() function
     */
    override fun hashCode(): Int {
        return {name.hashCode()+address.hashCode()+phoneNumber.hashCode()}.hashCode()
    }
}


