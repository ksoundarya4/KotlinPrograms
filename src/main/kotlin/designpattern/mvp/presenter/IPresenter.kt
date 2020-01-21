/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file IPresenter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.presenter

import designpattern.mvp.model.Student
import java.io.File

/**
 * Presenter Interface
 */
interface IPresenter {
    fun addStudent(file: File, student: Student)
    fun deleteStudent(file : File,student : Student)
}