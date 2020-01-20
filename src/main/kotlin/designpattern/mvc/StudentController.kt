/**
 * Design Pattern.
 * @purpose To implement MVC design pattern.
 * @file StudentController
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvc

class StudentController(val model: Student, val view: StudentView) {

    /**
     * Function to print updated student details
     * after it is modified.
     */
    fun updateView() {
        view.printStudentDetails(model.name, model.roleNumber)
    }
}