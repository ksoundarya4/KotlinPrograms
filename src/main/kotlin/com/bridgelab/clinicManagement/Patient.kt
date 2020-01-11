package com.bridgelab.clinicManagement

data class Patient(val name: String,
                   val patientID: Int,
                   val mobileNumber: String,
                   val age: Int) {

    override fun toString(): String {
        return "patient : $patientID,$name,$mobileNumber,$age"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Patient) {
            if (
                    other.name == this.name &&
                    other.patientID == this.patientID &&
                    other.mobileNumber == this.mobileNumber &&
                    other.age == this.age)
                return true
        }
        return false
    }

    override fun hashCode(): Int {
        return {patientID.toString()+name+mobileNumber+age.toString()}.hashCode()
    }
}