/**
 * Design Pattern
 * @purpose To test Factory design pattern
 * @file FactoryMethodTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 16/01/2020
 */
package designpattern.factory

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat


class FactoryMethodTest{

    @Test
    fun factoryMethod(){

        val indianCurrency = CurrencyFactory.currencyForCountry(India()).code
        val usaCurrency = CurrencyFactory.currencyForCountry(USA()).code

        assertThat(indianCurrency).isEqualTo("INR")
        assertThat(usaCurrency).isEqualTo("USD")
    }
}