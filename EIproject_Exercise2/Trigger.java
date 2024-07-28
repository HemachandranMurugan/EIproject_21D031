package EIproject_Exercise2;

public class Trigger {
    private String condition;
    private Command action;
    private SmartDevice targetDevice;

    public Trigger(String condition, Command action, SmartDevice targetDevice) {
        this.condition = condition;
        this.action = action;
        this.targetDevice = targetDevice;
    }

    public boolean checkCondition() {
        // Parse the condition (e.g., "temperature > 75")
        String[] parts = condition.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid condition format");
        }

        String attribute = parts[0];
        String operator = parts[1];
        String value = parts[2];

        // Get the current value of the attribute from the target device
        int currentValue = 0;
        if (targetDevice instanceof Thermostat) {
            Thermostat thermostat = (Thermostat) targetDevice;
            currentValue = thermostat.getTemperature();
        } else if (targetDevice instanceof Light) {
            Light light = (Light) targetDevice;
            currentValue = light.isOn() ? 1 : 0; // Convert boolean to 1 (on) or 0 (off)
        } else if (targetDevice instanceof DoorLock) {
            DoorLock doorLock = (DoorLock) targetDevice;
            currentValue = doorLock.isLocked() ? 1 : 0; // Convert boolean to 1 (locked) or 0 (unlocked)
        }

        // Evaluate the condition
        int targetValue = Integer.parseInt(value);
        switch (operator) {
            case ">":
                return currentValue > targetValue;
            case "<":
                return currentValue < targetValue;
            case "==":
                return currentValue == targetValue;
            case "!=":
                return currentValue != targetValue;
            default:
                throw new IllegalArgumentException("Invalid operator in condition");
        }
    }

    public void executeAction() {
        action.execute();
    }
}
