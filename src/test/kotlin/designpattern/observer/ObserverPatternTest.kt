/**
 * Design Pattern
 * @purpose To test Factory design pattern
 * @file ObserverPatternTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class ObserverPatternTest {

    @Test
    fun observerPattern() {
        val personOne = Person("Jhon")
        val personTwo = Person("Sam")

        val samsungMobile = Product("Samsung","Mobile","Available")

        samsungMobile.registerObserver(personOne)
        samsungMobile.registerObserver(personTwo)

        val output = samsungMobile.notifyObserver()
        assertThat(output).isSameAs(samsungMobile.notifyObserver())

    }
}