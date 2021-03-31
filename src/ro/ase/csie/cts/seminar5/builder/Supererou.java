
package ro.ase.csie.cts.seminar5.builder;

public class Supererou {

    String nume;
    int puncteViata;
    boolean esteNegativ;
    boolean esteRanitGrav;

    InterfataArma armaStanga;
    InterfataArma armaDreapta;
    InterfataSuperputere superputere;
    InterfataSuperputere supeSuperputere;

    public Supererou() {

    }

    public Supererou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga, InterfataArma armaDreapta, InterfataSuperputere superputere, InterfataSuperputere supeSuperputere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteNegativ = esteNegativ;
        this.esteRanitGrav = esteRanitGrav;
        this.armaStanga = armaStanga;
        this.armaDreapta = armaDreapta;
        this.superputere = superputere;
        this.supeSuperputere = supeSuperputere;
    }
}
