package ro.ase.csie.cts.seminar4.banking;

public class Bank {
    private static Bank INSTANCE;
    private EmailNotificationService emailNotificationService;
    private SMSNotificationService smsNotificationService;

    private Bank() {
        emailNotificationService = new EmailNotificationService();
    }

    public static synchronized Bank getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Bank();
        }
        return INSTANCE;
    }

    public DebitBankAccount openDebitAccount(Person holder) {
        DebitBankAccount account;
        if (holder.getAge() > 18)
            account = new FeeBankAccount(holder.getNotificationType() == Person.NotificationType.EMAIL ? emailNotificationService : smsNotificationService, generateIban(), holder);
        else
            account = new DebitBankAccount(holder.getNotificationType() == Person.NotificationType.EMAIL ? emailNotificationService : smsNotificationService, generateIban(), holder);
        return account;
    }

    private String generateIban() {
        return "INGB" + System.currentTimeMillis();
    }
}