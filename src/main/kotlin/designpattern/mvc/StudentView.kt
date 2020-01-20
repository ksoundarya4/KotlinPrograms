/**
 * Design Pattern
 * @purpose To implement MVC design pattern
 * @file StudentView.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvc

class StudentView {
    /**
     * Function to print student details.
     */
    fun printStudentDetails(studentName : String,studentRollNumber : String){
        println("Student : ")
        println("Name : $studentName")
        println("RollNumber: $studentRollNumber")
    }
}