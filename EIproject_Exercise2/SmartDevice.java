package EIproject_Exercise2;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


// Similar implementations for Thermostat and DoorLock


