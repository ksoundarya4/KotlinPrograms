package com.bridgelab.clinicManagement

class Search {

    val clinique = CliniqueManager()
    val doctorList = clinique.doctorList
    val patientList = clinique.patientList

    fun searchDoctorByName(doctorName: String): Boolean {
        for (doctor in doctorList) {
            if (doctorName == doctor.name) return true
        }
        return false
    }

    fun searchDoctorByID(doctorID: Int): Boolean {
        for (doctor in doctorList) {
            if (doctorID == doctor.doctorID) return true
        }
        return false
    }

    fun searchDoctorBySpecialization(specialization: String): Boolean {
        for (doctor in doctorList) {
            if (specialization == doctor.specialization) return true
        }
        return false
    }

    fun searchDoctorByAvailability(availability: String): Boolean {
        for (doctor in doctorList) {
            if (availability == doctor.availability) return true
        }
        return false
    }

    fun searchPatientByName(patientName : String) : Boolean{
        for(patient in patientList){
            if(patientName == patient.name) return true
        }
        return false
    }

    fun searchPatientByID(patientID : Int) : Boolean{
        for(patient in patientList){
            if(patientID == patient.patientID) return true
        }
        return false
    }

    fun searchPatientByMobileNumber(mobileNumber: String) : Boolean{
        for(patient in patientList){
            if(mobileNumber == patient.mobileNumber) return true
        }
        return false
    }

    fun findSearch(choice : Int){

    }
}