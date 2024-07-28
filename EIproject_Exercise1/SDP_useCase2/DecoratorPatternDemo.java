package SDP_useCase2;

// Test
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Notification basicNotification = new BasicNotification();
        Notification priorityNotification = new PriorityNotificationDecorator(basicNotification);
        Notification encryptedPriorityNotification = new EncryptedNotificationDecorator(priorityNotification);

        encryptedPriorityNotification.send();
    }
}
