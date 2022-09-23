package com.bn.commondesignpattern.ObserverPattern

interface Subject {
    fun register(observer: Observer?)
    fun unregister(observer: Observer?)
    fun notifyObservers()
}