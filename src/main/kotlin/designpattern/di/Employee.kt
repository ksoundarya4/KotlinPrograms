/**
 * Design Pattern
 * @purpose To implement dependency injection design pattern.
 * @file Employee.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.di

/**
 * Employee class having name and address
 * implements InjectAddress
 */
class Employee(val name: String) : InjectAddress {

    private var address: Address? = null

    /**
     * Function to override setAddress to
     * set employee address
     */
    override fun setAddress(address: Address) {
        this.address = address
    }

    /**
     * Function to override toString function.
     * To print Employee details.
     */
    override fun toString(): String {
        return "Employee : $name,$address"
    }
}