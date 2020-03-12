/**
 * Design Patterns
 * @purpose To implement factory design pattern
 * @file FactoryMethod.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 16/01/2020
 */
package designpattern.factory

/**
 * Country interface
 */
interface Country

/**
 * class USA implements Country
 */
class USA : Country

/**
 * class Greece implements Country
 */
class Greece : Country

/**
 * class India implements Country
 */
class India : Country

/**
 * Class Currency that has currency code
 */
data class Currency(val code: String)

/**
 * object CurrencyFactory
 */
object CurrencyFactory {

    /**
     * Function currencyForCountry return currency code of
     * corresponding country
     */
    fun currencyForCountry(country: Country): Currency =
            when (country) {
                is USA -> Currency("USD")
                is Greece -> Currency("EUR")
                is India -> Currency("INR")
                else -> Currency("USD")
            }
}
