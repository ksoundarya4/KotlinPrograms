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

class FileSystem : IModel {

    val objectMapper = jacksonObjectMapper()

    /**
     * Function to read json file.
     *
     * @param file to read from.
     * @return instance of Student
     */
    override fun readStudent(file: File) : Student {
        return objectMapper.readValue(file)
    }

    /**
     * Function to write to json file
     *
     * @param file to write
     * @param student instance of Student
     */
    override fun saveStudent(file: File, student: Student) {
        objectMapper.writeValue(file,student)
    }

//    override fun removeStudent(file: File) {
//        objectMapper.
//    }
}