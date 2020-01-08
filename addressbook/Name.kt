package com.bridgelabs.addressbook

data class Name(
    val firstName: String? = null,
    val lastName: String? = null
) {
    override fun equals(other: Any?): Boolean {
        if(other is Name){
          if(other.firstName == this.firstName && other.lastName == this.lastName)
              return true
        }
        return false
    }

    override fun toString(): String {
        return "$firstName $lastName"
    }

    override fun hashCode(): Int {
        return {firstName+lastName}.hashCode()
    }
}