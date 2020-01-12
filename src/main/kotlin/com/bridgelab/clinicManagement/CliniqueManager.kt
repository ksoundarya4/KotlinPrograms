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

    fun printDoctors() {
        println("List Of Doctors")
        println(doctorList)
    }

    fun printPatients() {
        println("List Of Patients")
        println(patientList)
    }

    fun takeAppointment() {
        println("Enter doctor id")
        val doctorId = readLine()!!.toInt()
        val doctor: Doctor? = search.searchDoctorByID(doctorId)

        if (doctor != null) {

            println("Enter date of Appointment")

            val dateString: String = readLine()!!.toString()
                val formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy")
                val date = LocalDate.parse(dateString, formatter)

            if (date == null) {
                println("Date format is not valid")
            } else {
                val appointment = Appointment(doctorId, date)

                if (appointmentMap.containsKey(appointment)) {
                    var numberOfAppointments = appointmentMap[appointment]

                    if (numberOfAppointments!! < 5) {
                        numberOfAppointments++
                        appointmentMap[appointment] = numberOfAppointments
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

    fun printAppointment(){
        println("Printing Appointment")
        appointmentMap.putAll(appointmentMap)
        println(appointmentMap)
    }

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