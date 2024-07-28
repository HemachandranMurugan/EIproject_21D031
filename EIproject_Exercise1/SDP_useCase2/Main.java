package SDP_useCase2;

public class Main {
}
// Component Interface
interface Notification {
    void send();
}

// Concrete Component
class BasicNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending basic notification");
    }
}

// Decorator
abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification decoratedNotification) {
        this.decoratedNotification = decoratedNotification;
    }

    public void send() {
        decoratedNotification.send();
    }
}

// Concrete Decorator 1
class PriorityNotificationDecorator extends NotificationDecorator {
    public PriorityNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send() {
        decoratedNotification.send();
        setPriority();
    }

    private void setPriority() {
        System.out.println("Setting priority");
    }
}

// Concrete Decorator 2
class EncryptedNotificationDecorator extends NotificationDecorator {
    public EncryptedNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send() {
        decoratedNotification.send();
        encrypt();
    }

    private void encrypt() {
        System.out.println("Encrypting notification");
    }
}


