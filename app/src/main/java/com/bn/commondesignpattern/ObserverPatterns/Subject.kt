package com.bn.commondesignpattern.ObserverPatterns

interface Subject {
    fun register(observer: Observer?)
    fun unregister(observer: Observer?)
    fun notifyObservers()
}