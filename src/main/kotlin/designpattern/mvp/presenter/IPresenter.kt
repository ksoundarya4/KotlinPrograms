package designpattern.mvp.presenter

import designpattern.mvp.model.Student
import java.io.File

interface IPresenter {
    fun addStudent(file: File, student: Student)
    fun deleteStudent(file : File,student : Student)
}