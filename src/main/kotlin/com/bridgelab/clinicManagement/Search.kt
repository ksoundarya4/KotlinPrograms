/**
 * Object Oriented Program
 * @purpose To create a search class that is used to
 * search doctor's and patients based on their attributes
 * @file Search.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.clinicManagement

class Search(private val doctorList : ArrayList<Doctor>,
             private val patientList : ArrayList<Patient> ) {

    /**
     * Function to search doctor by Name
     *
     * @param doctorName to search doctor
     * @return Doctor
     */
    fun searchDoctorByName(doctorName: String): Doctor? {
        for (doctor in doctorList) {
            if (doctorName == doctor.name) return doctor
        }
        return null
    }

    /**
     * Function to search doctor by ID
     *
     * @param doctorID to search doctor
     * @return Doctor
     */
    fun searchDoctorByID(doctorID: Int): Doctor? {
        for (doctor in doctorList) {
            if (doctorID == doctor.doctorID) return doctor
        }
        return null
    }

    /**
     * Function to search doctor by specialization
     *
     * @param specialization to search doctor
     * @return Doctor
     */
    fun searchDoctorBySpecialization(specialization: String): Doctor? {
        for (doctor in doctorList) {
            if (specialization == doctor.specialization) return doctor
        }
        return null
    }

    /**
     * Function to search doctor by availability
     *
     * @param availability to search doctor
     * @return Doctor
     */
    fun searchDoctorByAvailability(availability: String): Doctor? {
        for (doctor in doctorList) {
            if (availability == doctor.availability) return doctor
        }
        return null
    }

    /**
     * Function to search patient by Name
     *
     * @param patientName to search doctor
     * @return Patient
     */
    fun searchPatientByName(patientName: String): Patient? {
        for (patient in patientList) {
            if (patientName == patient.name) return patient
        }
        return null
    }

    /**
     * Function to search patient by ID
     *
     * @param patientID to search doctor
     * @return Patient
     */
    fun searchPatientByID(patientID: Int): Patient? {
        for (patient in patientList) {
            if (patientID == patient.patientID) return patient
        }
        return null
    }

    /**
     * Function to search patient by mobile number
     *
     * @param mobileNumber to search doctor
     * @return Patient
     */
    fun searchPatientByMobileNumber(mobileNumber: String): Patient? {
        for (patient in patientList) {
            if (mobileNumber == patient.mobileNumber) return patient
        }
        return null
    }

}