package org.example.utils

class Calculator() {

    fun calculateHitPoints(constitutionModifier: Int): Int {
        val baseHitPoints = 10 + constitutionModifier
        return baseHitPoints.coerceAtLeast(1)
    }

    fun calculateModifier(attributeValue: Int): Int {
        return (attributeValue - 10) / 2
    }


}
