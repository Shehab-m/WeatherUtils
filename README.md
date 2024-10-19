# Weather Utils Library

**Weather Utils** is a lightweight Android library designed to simplify weather-related data formatting and custom weather icon display. Whether you're working on a weather app or need to present weather information in a user-friendly way, this library provides reusable components for easy integration.

## Features

- **Weather Data Formatting:** Format temperature, humidity, and other weather metrics.
- **Custom Weather Icons:** Display weather icons based on conditions (e.g., sunny, rainy, snowy).
- **Lightweight & Efficient:** Easy to integrate with minimal impact on app performance.
- **Customizable:** Adjust formats and icons to suit your app’s design.

## Installation

To include the **Weather Utils** library in your Android project, follow these steps:

### 1. Clone the Repository

Clone the repository and build the library locally:

```bash
git clone https://github.com/yourusername/weather-utils.git
cd weather-utils
```
### 2. Publish to Maven Local

To publish the library to your local Maven repository, run:

```bash
./gradlew publishToMavenLocal
```

### 3. Add Dependency to Your Project

Once published locally, you can add the library to your project by including the following in your app’s `build.gradle`:

```gradle
dependencies {
    implementation ("com.vodafone.shehab:weatherUtils:1.0.1")
}
```

### Weather Conditions Reference

For more information on various weather conditions and their corresponding icons, please refer to the [OpenWeatherMap Weather Conditions](https://openweathermap.org/weather-conditions) documentation.
