/**
 * Object Oriented Programs
 * @description Address class containing
 * house number,street,locality,city,state and zip.
 * @file Address.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelab.addressbook

data class Address(
    var houseNumber: String,
    var street: String,
    var locality: String,
    var city: String,
    var state: String,
    var zip: String
) {
    /**
     * Function that overrides equals() function.
     */
    override fun equals(other: Any?): Boolean {
        if (other is Address) {
            if (other.houseNumber == this.houseNumber &&
                    other.street == this.street &&
                    other.locality == this.locality &&
                    other.city == this.city &&
                    other.state == this.state &&
                    other.zip == this.zip
            )
                return true
        }
        return false
    }

    /**
     * Function that overrides toString() function.
     */
    override fun toString(): String {
        return "$houseNumber,$street,$locality,$city,$state,$zip"
    }

    /**
     * Function that overrides hashCode() function.
     */
    override fun hashCode(): Int {
        return { houseNumber + street + locality + city + state + zip }.hashCode()
    }
}