/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file IModel.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */package designpattern.mvp.model

import java.io.File

/**
 * Model Interface
 */
interface IModel {

    fun readStudent(file : File) : Student
    fun saveStudent(file : File , student : Student)

}