package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class WeightTest : StringSpec() {
    init {
        "Should convert pounds to kg" {
            Weight(2.0, Unit1.Pound).convert(Unit1.Kilogram) shouldBe Weight(0.906, Unit1.Kilogram)
        }
        "Should  convert pounds to gram" {
            Weight(2.0,Unit1.Pound).convert(Unit1.Gram) shouldBe Weight(906.0,Unit1.Gram)
        }
        "should be able to add weight in grams" {
            Weight(4.0,Unit1.Kilogram).add(Weight(6.0,Unit1.Kilogram)) shouldBe Weight(10.0,Unit1.Kilogram)
        }

        "should be able to add grams and kilograms" {
            Weight(400.0,Unit1.Gram).add(Weight(0.8,Unit1.Kilogram)) shouldBe Weight(1200.0,Unit1.Gram)
        }

        "should be able to add kilograms and grams" {
            Weight(0.9,Unit1.Kilogram).add(Weight(400.0,Unit1.Gram)) shouldBe Weight(1.3,Unit1.Kilogram)
        }

        "should be able to add pounds and grams" {
            Weight(10.0,Unit1.Pound).add(Weight(400.0,Unit1.Gram)) shouldBe Weight(10.883002207505518,Unit1.Pound)
        }
    }
}

