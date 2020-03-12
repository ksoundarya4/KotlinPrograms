/**
 * Design Pattern
 * @purpose To implement MVP design pattern
 * @file Students.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.model

import java.io.File

abstract class Students : IModel{
    val students = ArrayList<Student>()
    val file  = File("/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/designpattern/mvp/model/student.json")

    /**
     * Function to add student to student list.
     */
    fun addStudent(student: Student){
        students.add(student)
    }

    /**
     * Function to remove student from Student list.
     */
    fun removeStudent(student : Student){
        students.remove(student)
    }
}