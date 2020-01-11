/**
 * Object Oriented Program
 * @purpose To create a patient class having
 * name, patient id, mobile number and age.
 * @file Patient.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/02/2020
 */
package com.bridgelab.clinicManagement

data class Patient(val name: String,
                   val patientID: Int,
                   val mobileNumber: String,
                   val age: Int) {

    /**
     * Function to override toString function
     * To print patient details
     */
    override fun toString(): String {
        return "patient : $patientID,$name,$mobileNumber,$age"
    }

    /**
     *Function to override equals function
     */
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

    /**
     * Function to override hashCode function
     */
    override fun hashCode(): Int {
        return {patientID.toString()+name+mobileNumber+age.toString()}.hashCode()
    }
}