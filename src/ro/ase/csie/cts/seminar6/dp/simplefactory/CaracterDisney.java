package ro.ase.csie.cts.seminar6.dp.simplefactory;

public class CaracterDisney extends SupererouAbstract{

    boolean cuAcordParental;

    public CaracterDisney(String nume, int puncteViata, boolean acordParental) {
        super(nume, puncteViata);
        this.cuAcordParental = acordParental;
    }

    @Override
    public void seDeplaseaza() {

    }
}
