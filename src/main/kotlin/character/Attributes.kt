    package character

    import org.example.utils.Calculator

    data class Attributes(
        val strength: Int,
        val dexterity: Int,
        val constitution: Int,
        val intelligence: Int,
        val wisdom: Int,
        val charisma: Int
    ) {
        private val calculator = Calculator()

        val strengthModifier: Int
            get() = calculator.calculateModifier(strength)

        val dexterityModifier: Int
            get() = calculator.calculateModifier(dexterity)

        val constitutionModifier: Int
            get() = calculator.calculateModifier(constitution)

        val intelligenceModifier: Int
            get() = calculator.calculateModifier(intelligence)

        val wisdomModifier: Int
            get() = calculator.calculateModifier(wisdom)

        val charismaModifier: Int
            get() = calculator.calculateModifier(charisma)
    }
