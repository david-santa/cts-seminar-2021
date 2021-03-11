package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Account> employees = new HashMap<>();

        Person p1 = new Person("Chuck Norris");
        Account b1 = new DebitBankAccount("RFZ123123132", p1);

        Person p2 = new Person("Arnold");
        Account b2 = new FeeBankAccount("INGB12312313",p2);

        Person p3 = new Person("Van Damme");
        Account b3  = new CreditBankAccount("BT123123123",p3,-10000);

        employees.put(p1,b1);
        employees.put(p2,b2);
        employees.put(p3,b3);

        for(Account a: employees.values()){
            a.deposit(1000);
        }

        for(Account a: employees.values()){
            try {
                a.withdraw(10);
            } catch (InsufficientFundsException e) {
                e.getMessage();
            }
        }
    }
}
