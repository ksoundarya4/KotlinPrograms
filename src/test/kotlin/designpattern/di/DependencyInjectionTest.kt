/**
 * Design Pattern
 * @purpose To Test Dependency injection design pattern.
 * @file DependencyInjectionTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.di

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DependencyInjectionTest {

    @Test
    fun testEmployee(){
        val address = Address("10","xxx","yyy","aaa","zzz")
        val employee = Employee("soundarya")

        employee.injectAddress(address)

        assertThat(employee.address).isEqualTo(address)
    }
}