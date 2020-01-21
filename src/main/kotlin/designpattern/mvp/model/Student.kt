/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file ksoundarya4
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.model

data class Student(var name : String, var rollNumber : String){

    /**
     * Function to override equals function.
     */
    override fun equals(other: Any?): Boolean {
        if(other is Student){
            if(other.name == this.name &&
                    other.rollNumber == this.rollNumber) return true
        }
        return false
    }

    /**
     * Function to override toString function
     */
    override fun toString() : String{
        return "Student : $name,$rollNumber"
    }

    /**
     * Function to override hashCode function
     */
    override fun hashCode() :Int {
        return {name+rollNumber}.hashCode()
    }
}