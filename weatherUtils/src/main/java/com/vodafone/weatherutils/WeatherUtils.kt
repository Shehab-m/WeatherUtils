package com.vodafone.weatherutils

fun Double.toFormatedTemperatureText(): String {
    return "$this°C"
}

fun Double.toFormatedWindSpeedText(): String {
    return "$this m/s"
}

fun getWeatherIcon(weatherCondition: String): Int {
    return when (weatherCondition) {
        "Thunderstorm" -> R.drawable.storm
        "Drizzle" -> R.drawable.rain
        "Rain" -> R.drawable.rain
        "Snow" -> R.drawable.snow
        "Atmosphere" -> R.drawable.atmosphere
        "Clear" -> R.drawable.clear
        "Clouds" -> R.drawable.clouds
        else -> R.drawable.atmosphere
    }
}