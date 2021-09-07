package com.example

data class Length(val value: Double, val unit: Unit) {
    fun add(length: Length): Length {
       val convertedValue = length.convert(unit).value
        return Length(convertedValue+value,unit)
    }
    fun convert (targetUnit: Unit): Length
    {
        return Length(((value*unit.scale)/targetUnit.scale),targetUnit)
    }
}

enum class Unit(val scale: Int) {

    Meter(1000),
    Millimeter(1),
    Centimeter(10)
}