/**
 * Object Oriented Programs
 * @description Name class containing firsName
 * and lastName.
 * @file Name.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelabs.addressbook

data class Name(
    var firstName: String,
    var lastName: String
) {
    /**
     * Function that overrides equals()
     */
    override fun equals(other: Any?): Boolean {
        if (other is Name) {
            if (other.firstName.equals(this.firstName) &&
                other.lastName.equals(this.lastName)
            )
                return true
        }
        return false
    }

    /**
     * Function that overrides toString()
     */
    override fun toString(): String {
        return "$firstName $lastName"
    }

    /**
     * Function that overrides hashCode()
     */
    override fun hashCode(): Int {
        return { firstName + lastName }.hashCode()
    }
}
