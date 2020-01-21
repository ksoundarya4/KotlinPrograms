/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file StudentView.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.view

import designpattern.mvp.model.Student
import designpattern.mvp.presenter.IPresenter
import java.io.File

abstract class StudentView(val presenter: IPresenter) : IView {

    /**
     * Function to add student
     */
    override fun onAddSuccess(message: String) {

        println("Enter file name to add student")
        val fileName = readLine()!!.toString()
        val file = File(fileName)

        println("Enter Student name\nStudent roll number")
        val name = readLine()!!.toString()
        val rollNumber = readLine()!!.toString()
        val student = Student(name, rollNumber)

        presenter.addStudent(file, student)

    }

    /**
     * Function to delete Student
     */
    override fun onDeleteSuccess(message: String) {

        println("Enter file name to delete student")
        val fileName = readLine()!!.toString()
        val file = File(fileName)

        println("Enter Student name\nStudent roll number")
        val name = readLine()!!.toString()
        val rollNumber = readLine()!!.toString()
        val student = Student(name,rollNumber)

        presenter.deleteStudent(file,student)

    }
}
