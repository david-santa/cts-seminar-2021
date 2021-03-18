package ro.ase.csie.cts.seminar4.banking;

public class Bank {
    private static Bank INSTANCE;

    private Bank() {
    }

    public static synchronized Bank getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Bank();
        }
        return INSTANCE;
    }

}