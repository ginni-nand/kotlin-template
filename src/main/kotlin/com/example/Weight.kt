package com.example

data class Weight(val value: Double, val unit: Unit1) {
    fun add(weight: Weight): Weight {
        val convertedValue = weight.convert(unit).value
        return Weight(convertedValue + this.value, this.unit)
    }

    fun convert(targetUnit: Unit1): Weight = Weight((value * unit.scale) / targetUnit.scale, targetUnit)

}

enum class Unit1(val scale: Double) {
    Kilogram(1000.0),
    Gram(1.0),
    Pound(453.0)
}