package ro.ase.csie.cts.seminar4;

import ro.ase.csie.cts.seminar4.banking.*;
import ro.ase.csie.cts.seminar4.singleton.Elvis;
import ro.ase.csie.cts.seminar4.singleton.ElvisEnum;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        Person p3 = new Person("Van Damme");
        p3.setEmail("van@damme.com");
        p3.setMobile("+12312331");
        BankAccount b3 = new CreditBankAccount(emailService, "BT123123123", p3,100);
        CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService,"ROBTRL123124124",p3,100);
        CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService,"ROING12312312",p3);

        BigInteger bi = new BigInteger(24,11, new Random());
        BigInteger bi2 = BigInteger.probablePrime(12,new Random());
        System.out.println(bi2);

        Boolean value = Boolean.valueOf("false");

        b.deposit(50);

        System.out.println(b.toString());

        Elvis elvis = Elvis.getInstance();
        Elvis elvis2 = Elvis.getInstance();
        System.out.println("\n\n");
        elvis.sing();
        elvis2.sing();

        ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
        elvisEnum.sing();
    }
}
