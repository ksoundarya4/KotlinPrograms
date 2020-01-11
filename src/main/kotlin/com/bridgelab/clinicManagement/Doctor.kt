package com.bridgelab.clinicManagement

class Doctor(val name: String,
             val doctorID: Int,
             val specialization: String,
             val availability: String) {

    var patientList: List<Patient>? = null

    override fun toString(): String {
        return "Doctor : $doctorID,$name,$specialization,$availability"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Doctor) {
            if (
                    other.name == this.name &&
                    other.doctorID == this.doctorID &&
                    other.specialization == this.specialization &&
                    other.availability == this.availability
            )
                return true
        }
        return false
    }

    override fun hashCode(): Int {
        return {name+doctorID.toString()+specialization+availability}.hashCode()
    }

}
