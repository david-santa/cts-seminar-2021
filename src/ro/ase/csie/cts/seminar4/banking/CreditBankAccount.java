package ro.ase.csie.cts.seminar4.banking;

public class CreditBankAccount extends BankAccount implements Receivable {

    public CreditBankAccount(NotificationService notificationService, String iban, Person accountHolder, long balance) {
        super(notificationService);
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(long amount) {
        notificationService.sendNotification(accountHolder,"Adding " + amount + " to " + iban);
        this.balance += amount;
    }

    public static CreditBankAccount createCreditBankAccount(NotificationService notificationService, String iban, Person accountHolder, long balance){
        return new CreditBankAccount(notificationService,iban,accountHolder,balance);
    }

    @Override
    public String toString() {
        return "CreditBankAccount{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
