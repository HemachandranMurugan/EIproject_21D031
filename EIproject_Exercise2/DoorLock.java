package EIproject_Exercise2;

import java.util.*;

public class DoorLock implements SmartDevice {
    private int id;
    private boolean isLocked;
    private List<Observer> observers = new ArrayList<>();

    public DoorLock(int id) {
        this.id = id;
        this.isLocked = true; // Default to locked
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void lock() {
        isLocked = true;
        notifyObservers();
    }

    public void unlock() {
        isLocked = false;
        notifyObservers();
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
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

