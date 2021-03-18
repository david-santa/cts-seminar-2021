package ro.ase.csie.cts.seminar4.banking;

public class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(Person destination, String message) {
        System.out.println("Sending SMS to " + destination.getMobile());
        System.out.println(message);
    }
}
