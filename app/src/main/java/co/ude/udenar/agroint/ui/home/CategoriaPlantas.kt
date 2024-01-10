package co.ude.udenar.agroint.ui.home

sealed class CategoriaPlantas {
    data class Arboles(val altura: Int, val tipoHojas: String) : CategoriaPlantas()
    data class Arbustos(val tamano: String) : CategoriaPlantas()
    data class Hierbas(val propiedadesMedicinales: Boolean) : CategoriaPlantas()
}
