package BDP_useCase1;

import java.util.ArrayList;
import java.util.List;

// Subject
interface WeatherStation {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// Concrete Subject
class WeatherData implements WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}

// Observer
interface WeatherObserver {
    void update(float temperature, float humidity);
}

// Concrete Observer
class TemperatureDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Temperature Display: Temperature = " + temperature);
    }
}




