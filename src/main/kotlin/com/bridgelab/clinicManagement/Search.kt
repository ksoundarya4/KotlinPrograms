package com.bridgelab.clinicManagement

class Search( val doctorList : ArrayList<Doctor>,
              val patientList : ArrayList<Patient> ) {


    fun searchDoctorByName(doctorName: String): Doctor? {
        for (doctor in doctorList) {
            if (doctorName == doctor.name) return doctor
        }
        return null
    }

    fun searchDoctorByID(doctorID: Int): Doctor? {
        for (doctor in doctorList) {
            if (doctorID == doctor.doctorID) return doctor
        }
        return null
    }

    fun searchDoctorBySpecialization(specialization: String): Doctor? {
        for (doctor in doctorList) {
            if (specialization == doctor.specialization) return doctor
        }
        return null
    }

    fun searchDoctorByAvailability(availability: String): Doctor? {
        for (doctor in doctorList) {
            if (availability == doctor.availability) return doctor
        }
        return null
    }

    fun searchPatientByName(patientName: String): Patient? {
        for (patient in patientList) {
            if (patientName == patient.name) return patient
        }
        return null
    }

    fun searchPatientByID(patientID: Int): Patient? {
        for (patient in patientList) {
            if (patientID == patient.patientID) return patient
        }
        return null
    }

    fun searchPatientByMobileNumber(mobileNumber: String): Patient? {
        for (patient in patientList) {
            if (mobileNumber == patient.mobileNumber) return patient
        }
        return null
    }

}