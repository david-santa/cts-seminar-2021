package ro.ase.csie.cts.seminar6.dp.simplefactory;

public abstract class SupererouAbstract {
    String nume;
    int puncteViata;

    public SupererouAbstract(String nume, int puncteViata) {
        super();
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public abstract void seDeplaseaza();
}
