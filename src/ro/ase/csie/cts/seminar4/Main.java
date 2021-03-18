package ro.ase.csie.cts.seminar4;

import ro.ase.csie.cts.seminar4.banking.*;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        Person p3 = new Person("Van Damme");
        p3.setEmail("van@damme.com");
        p3.setMobile("+12312331");
        BankAccount b3 = new CreditBankAccount(emailService, "BT123123123", p3,100);
        CreditBankAccount b = CreditBankAccount.createCreditBankAccount(emailService,"ROBTRL123124124",p3,100);

        b.deposit(50);

        System.out.println(b.toString());
    }
}
