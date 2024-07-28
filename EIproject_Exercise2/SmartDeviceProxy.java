package EIproject_Exercise2;

public class SmartDeviceProxy implements SmartDevice {
    private SmartDevice device;

    public SmartDeviceProxy(SmartDevice device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

    public String getStatus() {
        return device.getStatus();
    }

    public void addObserver(Observer observer) {
        device.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        device.removeObserver(observer);
    }

    public void notifyObservers() {
        device.notifyObservers();
    }
}
