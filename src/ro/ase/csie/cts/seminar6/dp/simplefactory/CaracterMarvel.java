package ro.ase.csie.cts.seminar6.dp.simplefactory;

public class CaracterMarvel extends SupererouAbstract{

    int putere;

    public CaracterMarvel(String nume, int puncteViata, int putere) {
        super(nume, puncteViata);
        this.putere = putere;
    }

    @Override
    public void seDeplaseaza() {

    }
}
