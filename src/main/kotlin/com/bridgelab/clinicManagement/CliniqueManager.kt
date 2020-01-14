/**
 * Object Oriented Program
 * @description Clinique Management Programme.
 * This programme is used to manage a list of Doctors associated with the Clinique.
 * This also manages the list of patients who use the clinique. It manages Doctors
 * by Name, Id, Specialization and Availability (AM,  PM or both). It manages Patients
 * by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by name,
 * id, Specialization or Availability. Also the programs allows users to search patient by
 * name, mobile number or id. The programs allows patients to take appointment with the
 * doctor. A doctor at  any availability time can see only 5 patients. If exceeded the
 * user can take appointment for patient at different date or availability time.
 * Print the Doctor Patient Report.
 * @file CliniqueManager.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 11/01/2020
 */
package com.bridgelab.clinicManagement

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class CliniqueManager {

    private val doctorList = ArrayList<Doctor>()
    private val patientList = ArrayList<Patient>()
    private val search = Search(doctorList, patientList)
    private var appointmentMap = HashMap<Appointment, Int>()

    /**
     * Function to add doctor's to doctorList
     */
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

    /**
     * Function to add patient's to patientList
     */
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

    /**
     * Function to print doctor's list
     */
    fun printDoctors() {
        println("List Of Doctors")
        println(doctorList)
    }

    /**
     * Function to print patient's list
     */
    fun printPatients() {
        println("List Of Patients")
        println(patientList)
    }

    /**
     * Function to take appointment from doctor
     * based on date and doctor id
     */
    fun takeAppointment() {
        println("Enter doctor id")
        val doctorId = readLine()!!.toInt()
        val doctor: Doctor? = search.searchDoctorByID(doctorId)

        if (doctor != null) {

            println("Enter date of Appointment")

            val dateString: String = readLine()!!.toString()
            val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val date = LocalDate.parse(dateString, formatter)

            if (date == null) {
                println("Date format is not valid")
            } else {
                val appointment = Appointment(doctorId, date)

                if (appointmentMap.containsKey(appointment)) {
                    var numberOfAppointments = appointmentMap.getValue(appointment)

                    if (numberOfAppointments < 5) {
                        appointmentMap[appointment] = ++numberOfAppointments
                        println("Appointment Scheduled on $date with doctor $doctor")
                    } else {
                        println("Please select some other date")
                    }
                } else {
                    appointmentMap[appointment] = 1
                }
            }
        } else {
            println("Enter valid doctor id")
        }
    }

    /**
     * Function to print doctor appointments
     */
    fun printAppointment() {
        println("Printing Appointment")
        //     appointmentMap.putAll(appointmentMap)
        println(appointmentMap)
    }

    /**
     * Function to search doctor or a patient
     * based on their attributes.
     */
    fun find() {

        println("Enter 1 to search doctor by name")
        println("Enter 2 to search doctor by doctorId")
        println("Enter 3 to search doctor by specialization")
        println("Enter 4 to search doctor by availability")
        println("Enter 5 to search patient by name")
        println("Enter 6 to search patient by patientId")
        println("Enter 7 to search patient by mobile")

        when (readLine()!!.toInt()) {
            1 -> {
                println("Enter doctor name to search")
                println(search.searchDoctorByName(readLine()!!.toString()))
            }
            2 -> {
                println("Enter doctor id to search")
                println(search.searchDoctorByID(readLine()!!.toInt()))
            }
            3 -> {
                println("Enter doctor specialization to search")
                println(search.searchDoctorBySpecialization(readLine()!!.toString()))
            }
            4 -> {
                println("Enter doctor availability to search")
                println(search.searchDoctorByAvailability(readLine()!!.toString()))
            }
            5 -> {
                println("Enter patient name to search")
                println(search.searchPatientByName(readLine()!!.toString()))
            }
            6 -> {
                println("Enter patient id to search")
                println(search.searchPatientByID(readLine()!!.toInt()))
            }
            7 -> {
                println("Enter patient mobile number to search")
                println(search.searchPatientByMobileNumber(readLine()!!.toString()))
            }
        }
    }

}