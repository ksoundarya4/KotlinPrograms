package designpattern.prototype

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class EmployeeTest{

    @Test
    fun testPrototype(){
        val employee1 = Employee(1,"sound","engineer")
        val employee2 = employee1.clone()

        assertThat(employee2).isEqualTo(employee1)

        employee2.id = 2
        employee2.name = "madhu"

        assertThat(employee2).isNotSameAs(employee1)
    }
}