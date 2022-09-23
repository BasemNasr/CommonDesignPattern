package com.bn.commondesignpattern.AdapterPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bn.commondesignpattern.R

class AdapterPatternExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_pattern_example)


        val currencyToDollarConverter = CurrencyToDollarConverter()
        currencyToDollarConverter.convertCurrency("Country name")

        val currencyToEuroConverter = CurrencyToEuroConverter()
        val currencyConverterAdapter = CurrencyConverterAdapter(currencyToEuroConverter)
        currencyConverterAdapter.convertCurrency("Country name")

    }
}