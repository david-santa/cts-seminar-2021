package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Receivable> employees = new HashMap<>();

        NotificationService emailNotificationService = new EmailNotificationService();

        Person p1 = new Person("Chuck Norris");
        p1.setEmail("chuck@norris.com");
        CreditBankAccount b1 = new CreditBankAccount(emailNotificationService,"ROBTRL123123213", p1,-1000);
        p1.setMobile("+4124124124");

        Person p2 = new Person("Arnold");
        FeeBankAccount b2 = new FeeBankAccount(emailNotificationService,"INGB12312313",p2);
        p2.setEmail("arnold@arnold.com");
        p2.setMobile("+12490120431");

        Person p3 = new Person("Van Damme");
        DebitBankAccount b3  = new DebitBankAccount(emailNotificationService,"BT123123123",p3);
        p3.setEmail("van@damme.com");
        p3.setMobile("+12312331");

        employees.put(p1,b1);
        employees.put(p2,b2);
        employees.put(p3,b3);

        for(Receivable a: employees.values()){
            a.deposit(1000);
        }

        Map<Person, Payable> union = new HashMap<>();

        union.put(p2,b2);
        union.put(p3,b3);

        for(Payable a: union.values()){
            try {
                a.withdraw(10);
            } catch (InsufficientFundsException e) {
                e.getMessage();
            }
        }

        try {
            b2.transfer(b1,20);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
