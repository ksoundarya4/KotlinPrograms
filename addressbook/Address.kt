/**
 * Object Oriented Programs
 * @description Address class containing
 * house number,street,locality,city,state and zip.
 * @file Address.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 08/01/2020
 */
package com.bridgelabs.addressbook

data class Address(
    var houseNumber: String? = null,
    var street: String? = null,
    var locality: String? = null,
    var city: String? = null,
    var state: String? = null,
    var zip: String? = null
) {
    /**
     * Function that overrides equals() function.
     */
    override fun equals(other: Any?): Boolean {
        if (other is Address) {
            if (other.houseNumber.equals(this.houseNumber) &&
                other.street.equals(this.street) &&
                other.locality.equals(this.locality) &&
                other.city.equals(this.city) &&
                other.state.equals(this.state) &&
                other.zip.equals(this.zip)
            )
                return true
        }
        return false
    }

    /**
     * Function that overrides toString() function.
     */
    override fun toString(): String {
        return "Address : $houseNumber,$street,$locality,$city,$state,$zip"
    }

    /**
     * Function that overrides hashCode() function.
     */
    override fun hashCode(): Int {
        return { houseNumber + street + locality + city + state + zip }.hashCode()
    }
}