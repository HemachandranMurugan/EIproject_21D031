package EIproject_Exercise2;

import java.util.*;

public class Thermostat implements SmartDevice {

    private int id;
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public Thermostat(int id) {
        this.id = id;
        //this.temperature = initialTemperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees.";
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
