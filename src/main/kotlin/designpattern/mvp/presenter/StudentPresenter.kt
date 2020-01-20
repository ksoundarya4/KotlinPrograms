package designpattern.mvp.presenter

import designpattern.mvp.model.IModel
import designpattern.mvp.model.Student
import designpattern.mvp.view.IView
import java.io.File

class StudentPresenter(val view: IView, val model: IModel) : IPresenter {

    override fun addStudent(file: File, student: Student) {
        model.addStudent(student)
    }

    override fun deleteStudent(file: File, student: Student) {
        model.removeStudent(student)
    }

}