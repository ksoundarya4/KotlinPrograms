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