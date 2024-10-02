package main.kotlin.character

import character.Attributes
import org.example.classes.CharacterClass
import org.example.races.RaceStrategy
import org.example.utils.HitPointsCalculator


class Character(
    val name: String,
    val race: RaceStrategy,
    val characterClass: CharacterClass,
    val alignment: String,  // Novo atributo: Alinhamento do personagem
    val background: String,  // Novo atributo: Background do personagem
    baseAttributes: Attributes,
) {
    private var _baseAttributes: Attributes = baseAttributes
    private var _adjustedAttributes: Attributes = race.applyRaceBonuses(_baseAttributes)

    // Getters para os atributos privados
    val baseAttributes: Attributes
        get() = _baseAttributes

    val adjustedAttributes: Attributes
        get() = _adjustedAttributes


    // Modificadores de atributos
    val strength_Modifier: Int = calculateModifier(adjustedAttributes.strength)
    val dexterity_Modifier: Int = calculateModifier(adjustedAttributes.dexterity)
    val constitution_Modifier: Int = calculateModifier(adjustedAttributes.constitution)
    val intelligence_Modifier: Int = calculateModifier(adjustedAttributes.intelligence)
    val wisdom_Modifier: Int = calculateModifier(adjustedAttributes.wisdom)
    val charisma_Modifier: Int = calculateModifier(adjustedAttributes.charisma)

    // Calcula pontos de vida usando a classe HitPointsCalculator
    private val hitPointsCalculator = HitPointsCalculator(constitution_Modifier)
    val hitPoints: Int = hitPointsCalculator.calculateHitPoints()

    // Calcula o modificador de um atributo
    private fun calculateModifier(attributeValue: Int): Int {
        return (attributeValue - 10) / 2
    }

    }
