package designpattern.mvp.view

import designpattern.mvp.model.Student
import designpattern.mvp.presenter.IPresenter
import java.io.File

class StudentView(val presenter : IPresenter) : IView{

    override fun onAddFailure(message: String) {
        println(message)
    }

    override fun onAddSuccess(message: String) {
        println(message)

        println("Enter file name to add student")
        val fileName = readLine()!!.toString()
        val file = File(fileName)

        println("Enter Student name\nStudent roll number")
        val name = readLine()!!.toString()
        val rollNumber = readLine()!!.toString()
        val student = Student(name,rollNumber)

        presenter.addStudent(presenter.addStudent(file,student))
    }
    }
