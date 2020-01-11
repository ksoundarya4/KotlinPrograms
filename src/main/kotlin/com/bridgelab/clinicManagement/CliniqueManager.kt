package com.bridgelab.clinicManagement

class CliniqueManager {

    val doctorList = ArrayList<Doctor>()
    val patientList = ArrayList<Patient>()

    fun addDoctor() {
        println("Enter doctor name")
        val doctorName = readLine()!!.toString()

        println("Enter doctorId ")
        val doctorID = readLine()!!.toInt()

        println("Enter doctor's specialization")
        val specialization = readLine()!!.toString()

        println("Enter doctor's availability in a.m or p.m")
        val availability = readLine()!!.toString()

        val doctor = Doctor(doctorName, doctorID, specialization, availability)
        doctorList.add(doctor)
    }

    fun addPatient() {
        println("Enter patient name")
        val patientName = readLine()!!.toString()

        println("Enter patient id")
        val patientID = readLine()!!.toInt()

        println("Enter patient mobile number")
        val mobileNumber = readLine()!!.toString()

        println("Enter patient age")
        val patientAge = readLine()!!.toInt()

        val patient = Patient(patientName, patientID, mobileNumber, patientAge)
        patientList.add(patient)
    }
}