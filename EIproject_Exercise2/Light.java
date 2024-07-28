package EIproject_Exercise2;

import java.util.*;

public class Light implements SmartDevice {
    private int id;
    private boolean isOn;
    private List<Observer> observers = new ArrayList<>();

    public Light(int id) {
        this.id = id;
    }

    public void turnOn() {
        isOn = true;
        notifyObservers();
    }

    public void turnOff() {
        isOn = false;
        notifyObservers();
    }

    public boolean isOn() {
        return isOn;
    }

    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
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
