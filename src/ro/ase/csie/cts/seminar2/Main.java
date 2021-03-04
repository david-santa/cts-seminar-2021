package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.InsufficientFundsException;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("David");
        BankAccount account = new BankAccount("INGB123124124", p);
        account.deposit(100);
        try {
            account.withdraw(50);
            account.withdraw(70);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds");
        }
        System.out.println(account.getBalance());
    }
}
