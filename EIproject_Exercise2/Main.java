package EIproject_Exercise2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();

        SmartDevice light1 = SmartDeviceFactory.createDevice("light", 1);
        SmartDevice thermostat1 = SmartDeviceFactory.createDevice("thermostat", 2);
        SmartDevice door1 = SmartDeviceFactory.createDevice("door", 3);

        system.addDevice(light1);
        system.addDevice(thermostat1);
        system.addDevice(door1);

        Command turnOnLight1 = new TurnOnCommand(light1);
        Command turnOffLight1 = new TurnOffCommand(light1);

        system.executeCommand(turnOnLight1);
        system.addSchedule(turnOffLight1, LocalTime.of(22, 0));

        // Create a trigger to turn off the light if the temperature exceeds 75 degrees
        Trigger trigger = new Trigger("temperature > 75", turnOffLight1, thermostat1);

        system.addTrigger(trigger);
        
        system.showStatus();
        system.checkTriggers();
        system.executeScheduledTasks();
    }
}
