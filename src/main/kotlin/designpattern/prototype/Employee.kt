/**
 * Design Pattern
 * @purpose to implement prototype design pattern.
 * @file Employee.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.prototype

/**
 * Employee class having employee id,
 * name and designation implements Prototype.
 */
class Employee(val id: Int,
               val name: String,
               val designation: String) : Prototype {

    /**
     * Function to override clone()
     *
     * @return instance of Employee.
     */
    override fun clone(): Employee {
        println(" Returning instance of employee")
        return Employee(id,name,designation)
    }

    /**
     * Function to override toString()
     *To print employee details.
     */
    override fun toString(): String {
        return "Employee : $id,$name,$designation"
    }
}