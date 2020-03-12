/**
 * Design Pattern
 * @purpose To test MVC design pattern
 * @file MVCTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvc

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MVCTest {

    @Test
    fun studentController() {
        val model = Student("48", "soundarya")
        val view = StudentView()
        val controller = StudentController(model, view)

        assertThat(controller.updateView()).isEqualTo(view.printStudentDetails(model.name, model.roleNumber))
    }
}