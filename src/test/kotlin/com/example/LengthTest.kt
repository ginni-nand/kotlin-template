package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec() {
    init {
        "Should be able to add to another length in meters " {
            Length(4.0, Unit.Meter).add(Length(3.0, Unit.Meter)) shouldBe Length(7.0, Unit.Meter)
        }
        "Should be able to add to meter to centimeter " {
            Length(3.0, Unit.Meter).add(Length(300.0, Unit.Centimeter)) shouldBe Length(6.0, Unit.Meter)
        }
        "should convert centimeter to millimeter " {
            Length(400.0, Unit.Centimeter).convert(Unit.Millimeter) shouldBe Length(4000.0, Unit.Millimeter)
        }
        "Should convert meter to millimeter" {
            Length(4.0, Unit.Meter).convert(Unit.Millimeter) shouldBe Length(4000.0, Unit.Millimeter)
        }
        "should convert millimeter to centimeter" {
            Length(400.0, Unit.Millimeter).convert(Unit.Centimeter) shouldBe Length(40.0, Unit.Centimeter)
        }
        "should convert meter to centimeter " {
            Length(4.4, Unit.Meter).convert(Unit.Centimeter) shouldBe Length(440.0, Unit.Centimeter)
        }
        "should convert centimeter to meter " {
            Length(220.0, Unit.Centimeter).convert(Unit.Meter) shouldBe Length(2.20, Unit.Meter)
        }
        "should convert centimeter to millimeter" {
            Length(220.0, Unit.Centimeter).convert(Unit.Millimeter) shouldBe Length(2200.0, Unit.Millimeter)
        }
    }
}