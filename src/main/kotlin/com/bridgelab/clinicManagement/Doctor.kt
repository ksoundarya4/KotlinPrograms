/**
 * Object Oriented Program
 * @purpose To crete a Doctor class having
 * name, doctor id, specialization, availability.
 * @file Doctor.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.clinicManagement

class Doctor(val name: String,
             val doctorID: Int,
             val specialization: String,
             val availability: String) {

    var patientList: List<Patient>? = null

    /**
     * Function to override toString function
     * To print doctor details
     */
    override fun toString(): String {
        return "Doctor : $doctorID,$name,$specialization,$availability"
    }

    /**
     * Function to override equals function
     */
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

    /**
     * Function to override hahCode function
     */
    override fun hashCode(): Int {
        return { name + doctorID.toString() + specialization + availability }.hashCode()
    }
}
