package ro.ase.csie.cts.seminar4.banking;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String s) {
        super(s);
    }
}
