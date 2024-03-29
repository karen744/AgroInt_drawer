package co.ude.udenar.agroint.data.model

data class DataDay(
    val convective_precipitation: List<Double>,
    val felttemperature_max: List<Double>,
    val felttemperature_min: List<Double>,
    val humiditygreater90_hours: List<Double>,
    val indexto1hvalues_end: List<Int>,
    val indexto1hvalues_start: List<Int>,
    val pictocode: List<Int>,
    val precipitation: List<Double>,
    val precipitation_hours: List<Double>,
    val precipitation_probability: List<Int>,
    val predictability: List<Int>,
    val predictability_class: List<Int>,
    val rainspot: List<String>,
    val relativehumidity_max: List<Int>,
    val relativehumidity_mean: List<Int>,
    val relativehumidity_min: List<Int>,
    val sealevelpressure_max: List<Int>,
    val sealevelpressure_mean: List<Int>,
    val sealevelpressure_min: List<Int>,
    val snowfraction: List<Double>,
    val temperature_max: List<Double>,
    val temperature_mean: List<Double>,
    val temperature_min: List<Double>,
    val time: List<String>,
    val uvindex: List<Int>,
    val winddirection: List<Int>,
    val windspeed_max: List<Double>,
    val windspeed_mean: List<Double>,
    val windspeed_min: List<Double>
)