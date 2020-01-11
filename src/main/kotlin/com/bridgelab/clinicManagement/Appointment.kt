package com.bridgelab.clinicManagement

import java.util.*

class Appointment(val doctorId: Int,
                  val date: Date) {

    override fun toString(): String {
        return "Appointment : $doctorId , $date"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Appointment) {
            if (other.doctorId == this.doctorId &&
                    other.date == this.date) return true
        }
        return false
    }

    override fun hashCode(): Int {
        return {doctorId.toString()+date.toString()}.hashCode()
    }
}
