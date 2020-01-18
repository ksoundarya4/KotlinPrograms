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
class Employee(var id: Int,
               var name: String,
               val designation: String) : Prototype {

    /**
     * Function to override clone()
     *
     * @return instance of Employee.
     */
    override fun clone(): Employee {
        return Employee(id, name, designation)
    }

    /**
     * Function to override toString()
     *To print employee details.
     */
    override fun toString(): String {
        return "Employee : $id,$name,$designation"
    }

    override fun hashCode(): Int {
        return { id.toString() + name + designation }.hashCode()
    }

    /**
     * Function to override equals()
     */
    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            if (other.id == this.id &&
                    other.name == this.name &&
                    other.designation == this.designation) return true
        }
        return false
    }
}