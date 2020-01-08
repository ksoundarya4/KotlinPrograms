package com.bridgelabs.addressbook

data class Person(
    val name: Name? = null,
    val address: Address? = null,
    val phoneNumber: String? = null
) {

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

    override fun toString(): String {
        return "Name : $name \n Address : $address \n PhoneNumber : $phoneNumber"
    }

    override fun hashCode(): Int {
        return {name.hashCode()+address.hashCode()+phoneNumber.hashCode()}.hashCode()
    }
}


