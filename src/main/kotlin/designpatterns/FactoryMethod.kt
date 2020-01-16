package designpatterns

interface Country
class USA : Country
class Greece : Country
class India : Country

class Currency(val code : String)


object CurrencyFactory {

    fun currencyForCountry(country : Country) : Currency =
        when(country){
            is USA -> Currency("USD")
            is Greece -> Currency("EUR")
            is India -> Currency("INR")
            else -> Currency("None")
        }
}

fun main() {
    println(CurrencyFactory.currencyForCountry(India()))
}