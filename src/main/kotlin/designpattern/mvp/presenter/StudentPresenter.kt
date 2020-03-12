/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file StudentPresenter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.presenter

import designpattern.mvp.model.IModel
import designpattern.mvp.model.Student
import designpattern.mvp.view.IView
import java.io.File

class StudentPresenter(val view: IView, val model: IModel) : IPresenter {

    /**
     * Function to add Student to .json file
     */
    override fun addStudent(file: File, student: Student) {
        model.saveStudent(file, student)

        val savedStudent = model.readStudent(file)
        if(savedStudent.equals(student))
        view.onAddSuccess("Added Successfully")
        else view.onAddFailure("Add is Unsuccessful")
    }

    /**
     * Function to remove student from .json file
     */
    override fun deleteStudent(file: File, student: Student) {
        val removeStudent = model.readStudent(file)

        if (removeStudent.equals(student)) {
            removeStudent.name = ""
            removeStudent.rollNumber = ""
            model.saveStudent(file, removeStudent)
            view.onDeleteSuccess("Deleted Successfully")
        } else view.onDeleteFailure("Delete Unsuccessful")
    }

}