/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file FileSystem
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.model

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

abstract class FileSystem : IModel {

    val objectMapper = jacksonObjectMapper()

    /**
     * Function to read json file.
     *
     * @param file to read from.
     * @return instance of Student
     */
    override fun readStudent(file: File) : Students {
        return objectMapper.readValue(file)
    }

    /**
     * Function to write to json file
     *
     * @param file to write
     * @param student instance of Student
     */
    override fun saveStudent(file: File, students: Student) {
        objectMapper.writeValue(file,students)
    }

//    override fun removeStudent(file: File) {
//        objectMapper.
//    }
}