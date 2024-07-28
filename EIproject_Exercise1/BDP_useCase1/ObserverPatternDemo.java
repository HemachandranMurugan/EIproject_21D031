package BDP_useCase1;

// Test
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();

        weatherData.addObserver(tempDisplay);
        weatherData.addObserver(humidityDisplay);

        weatherData.setMeasurements(25.0f, 60.0f);
    }
}
