package org.example.utils

class HitPointsCalculator(
    private val constitutionModifier: Int
) {
    // Calcula os pontos de vida
    fun calculateHitPoints(): Int {
        // Calcular pontos de vida com base em 10 + modificador de Constituição
        val baseHitPoints = 10 + constitutionModifier
        return baseHitPoints.coerceAtLeast(1) // Garantir que os pontos de vida não sejam menores que 1
    }
}
