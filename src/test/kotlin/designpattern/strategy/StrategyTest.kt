/**
 * Design Pattern
 * @purpose To test strategy design pattern
 * @file StrategyTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.strategy

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StrategyTest {

    @Test
    fun strategy() {
        val context = Context(OperationAdd())

        val sum = context.executeStrategy(5,4)
        assertThat(sum).isEqualTo(9)
    }
}