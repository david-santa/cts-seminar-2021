package ro.ase.csie.cts.seminar2.solid;

public class BankAccount {
    private String iban;
    private long balance;
    private Person accountHolder;

    public BankAccount(String iban, String accountHolderName, Person person) {
        this.iban = iban;
        this.accountHolder = person;
        this.balance = 0;
    }

    public void withdraw(long amount){
        balance -= amount;
    }

    public void deposit(long amount){
        balance += amount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }
}
