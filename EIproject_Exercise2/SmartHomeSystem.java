package EIproject_Exercise2;

import java.time.*;
import java.util.*;

public class SmartHomeSystem {
    private List<SmartDevice> devices = new ArrayList<>();
    private List<ScheduledTask> schedules = new ArrayList<>();
    private List<Trigger> triggers = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public void addSchedule(Command command, LocalTime time) {
        schedules.add(new ScheduledTask(command, time));
    }

    public void addTrigger(Trigger trigger) {
        triggers.add(trigger);
    }

    public void checkTriggers() {
        for (Trigger trigger : triggers) {
            if (trigger.checkCondition()) {
                trigger.executeAction();
            }
        }
    }

    public void showStatus() {
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public void executeScheduledTasks() {
        for (ScheduledTask task : schedules) {
            task.executeIfScheduled();
        }
    }
}
