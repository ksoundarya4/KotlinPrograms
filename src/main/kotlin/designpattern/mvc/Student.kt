/**
 * Design Pattern
 * @purpose To implement MVC design pattern.
 * @file Student.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvc

data class Student(val roleNumber: String, val name: String) {

    /**
     * Function to override toString function
     * To print student details.
     */
    override fun toString(): String {
        return "Student : $,$name"
    }

    /**
     * Function to override equals function.
     */
    override fun equals(other: Any?): Boolean {
        if (other is Student) {
            if (other.roleNumber == this.roleNumber &&
                    other.name == this.name) return true
        }
        return false
    }

    /**
     * Function to override hashCode function.
     */
    override fun hashCode(): Int {
        return {roleNumber+name}.hashCode()
    }
}