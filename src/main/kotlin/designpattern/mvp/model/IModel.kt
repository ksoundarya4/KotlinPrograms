package designpattern.mvp.model

import java.io.File

interface IModel {

    fun readStudent(file : File) : Student
    fun saveStudent(file : File , student : Student)

}