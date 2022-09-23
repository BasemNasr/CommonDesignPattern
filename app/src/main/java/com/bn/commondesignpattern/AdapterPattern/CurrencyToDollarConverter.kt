package com.bn.commondesignpattern.AdapterPattern

import android.util.Log

class CurrencyToDollarConverter: CurrencyConverter{
    override fun convertCurrency(countryName: String) {
        Log.v("PATTERNS","Dollar Currency")
    }
}