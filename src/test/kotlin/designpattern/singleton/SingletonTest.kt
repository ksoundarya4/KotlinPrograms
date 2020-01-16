/**
 * Design Pattern
 * @purpose To test Singleton design pattern
 * @file SingletonTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 16/01/2020
 */
package designpattern.singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SingletonTest {

    @Test
    fun print() {
        val expectedOutput = Singleton.print()
        val expectedOutput2 = Singleton.print()
        assertThat(expectedOutput).isSameAs(Singleton.print())
        assertThat(expectedOutput2).isSameAs(Singleton.print())
    }

    @Test
    fun dosomething() {
        val expectedOutput = Singleton.dosomething()
        val expectedOutput2 = Singleton.print()
        assertThat(expectedOutput).isSameAs(Singleton.dosomething())
        assertThat(expectedOutput2).isSameAs(Singleton.print())
    }
}