package com.bn.commondesignpattern.AdapterPattern

class CurrencyConverterAdapter(private val currencyToEuroConverter: CurrencyToEuroConverter): CurrencyConverter{
    override fun convertCurrency(countryName: String) {
        val currencyIsoCode = getCurrencyIsoCode()
        currencyToEuroConverter.convertCurrency(currencyIsoCode)
    }

    private fun getCurrencyIsoCode(): String = "This is ISO code"
}