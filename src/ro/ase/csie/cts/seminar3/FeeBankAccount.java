package ro.ase.csie.cts.seminar3;

public class FeeBankAccount extends DebitBankAccount {

    private long fee = 2;

    public FeeBankAccount(NotificationService notificationService,String iban, Person person) {
        super(notificationService,iban, person);
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {
        System.out.println("Adding " + fee + " fee ");
        amount+=fee;
        System.out.println("Withdrawing " + amount + " from " + getIban());
    }
}
