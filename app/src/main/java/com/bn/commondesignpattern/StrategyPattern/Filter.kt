package com.bn.commondesignpattern.StrategyPattern

abstract class Filter<T> {
    var value: T? = null

    fun setValue(value: T) {
        this.value = value
    }
}