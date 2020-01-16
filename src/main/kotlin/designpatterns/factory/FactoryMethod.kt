package designpatterns.factory

interface Country
class USA : Country
class Greece : Country
class India : Country

class Currency(val code : String){
    override fun toString(): String {
        return code
    }
}


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