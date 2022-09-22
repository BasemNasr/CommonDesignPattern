package com.bn.commondesignpattern.BuilderPattern.data

class PersonalComputer(builder: Builder){
    private val cpu: String = builder.cpu
    private val ram: String = builder.ram
    private val batteryCapacity: String = builder.batteryCapacity
    private val screenSize: String = builder.screenSize

    class Builder(cpu: String){
        var cpu: String = cpu
        var ram: String = "8G"
        var batteryCapacity: String = "10000mAH"
        var screenSize: String = "17inch"
        fun setRam(ram: String): Builder {
            this.ram = ram
            return this
        }
        fun setBattery(batteryCapacity: String): Builder {
            this.batteryCapacity = batteryCapacity
            return this
        }
        fun setScreenSize(screenSize: String): Builder {
            this.screenSize = screenSize
            return this
        }
        fun build(): PersonalComputer {
            return PersonalComputer(this)
        }
    }
}