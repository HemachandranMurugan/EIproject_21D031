package EIproject_Exercise2;
import java.time.*;

public class ScheduledTask {
    private Command command;
    private LocalTime time;

    public ScheduledTask(Command command, LocalTime time) {
        this.command = command;
        this.time = time;
    }

    public void executeIfScheduled() {
        if (LocalTime.now().equals(time)) {
            command.execute();
        }
    }
}

