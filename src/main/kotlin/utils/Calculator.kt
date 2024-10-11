package org.example.utils

import org.example.classes.CharacterClass
import org.example.classes.Fighter
import org.example.classes.Wizard
import org.example.races.Dwarf
import org.example.races.Elf
import org.example.races.RaceStrategy
import org.example.races.Undead

class Calculator() {

    fun calculateHitPoints(constitutionModifier: Int): Int {
        val baseHitPoints = 10 + constitutionModifier
        return baseHitPoints.coerceAtLeast(1)
    }

    fun calculateModifier(attributeValue: Int): Int {
        return (attributeValue - 10) / 2
    }

    fun getCharacterClass(className: String): CharacterClass {
        return when (className) {
            "Fighter" -> Fighter()
            "Wizard" -> Wizard()
            else -> throw IllegalArgumentException("Class not found")
        }
    }

    fun getRaceStrategy(raceName: String): RaceStrategy {
        return when (raceName) {
            "Dwarf" -> Dwarf()
            "Elf" -> Elf()
            "Undead" -> Undead()
            else -> throw IllegalArgumentException("Race not found")
        }
    }
}
