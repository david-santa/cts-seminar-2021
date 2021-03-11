package ro.ase.csie.cts.seminar3;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(Person destination, String message) {
        System.out.println("Sending email to " + destination.getEmail());
        System.out.println(message);
    }
}
