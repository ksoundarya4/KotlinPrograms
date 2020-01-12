package com.bridgelab.clinicManagement
fun main() {
    val cliniqueManager = CliniqueManager()

    do {
        println("---------------Clinique Management System----------------")
        println()
        println("Enter 1 to Add Doctor")
        println("Enter 2 to Add Patient")
        println("Enter 3 to print all Doctors")
        println("Enter 4 to print all Patients")
        println("Enter 5 to take Appointment")
        println("Enter 6 to print Appointment")
        println("Enter 7 to search Doctor or Patient")
        println("Enter 8 to exit")
        println()
        println("Enter your choice")

        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> cliniqueManager.addDoctor()
            2 -> cliniqueManager.addPatient()
            3 -> cliniqueManager.printDoctors()
            4 -> cliniqueManager.printPatients()
            5 -> cliniqueManager.takeAppointment()
            6 -> cliniqueManager.printAppointment()
            7 -> cliniqueManager.find()
            8 -> System.exit(0)
            else -> println("Invalid choice")
        }
    }while(choice < 9)
}