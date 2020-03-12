/**
 * Design Pattern
 * @purpose To test delegate design pattern
 * @file DelegateTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.delegate

import org.junit.Test

class DelegateTest{

    @Test
    fun delegate(){

        val machine = Machine()
        machine.start()
    }
}