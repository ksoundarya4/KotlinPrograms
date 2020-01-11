/**
 * Object Oriented Program
 * @purpose To create a Appointment class
 * having doctorId and date of appointment
 * @file Appointment.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/02/2020
 */
package com.bridgelab.clinicManagement

import java.time.LocalDate

class Appointment(val doctorId: Int,
                  val date: LocalDate) {
    /**
     * Function to override toString function
     */
    override fun toString(): String {
        return "Appointment : $doctorId , $date"
    }

    /**
     * Function to override equals function
     */
    override fun equals(other: Any?): Boolean {
        if (other is Appointment) {
            if (other.doctorId == this.doctorId &&
                    other.date == this.date) return true
        }
        return false
    }

    /**
     * Function to override hashCode function
     */
    override fun hashCode(): Int {
        return {doctorId.toString()+date.toString()}.hashCode()
    }
}
