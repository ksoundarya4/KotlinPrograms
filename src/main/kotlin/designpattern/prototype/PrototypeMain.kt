/**
 * Design Pattern
 * @purpose to implement prototype design pattern.
 * @file PrototypeMain.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.prototype

fun main() {

    val employee1 = Employee(1, "sound", "software developer")
    var employee2 = employee1.clone()

    if(employee1 == employee2) {
        println(employee1)
        println(employee2)
    }

    employee2.name = "muduu"
    employee2.id = 2

    println(employee2)

}
