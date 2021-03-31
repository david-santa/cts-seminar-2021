
package ro.ase.csie.cts.seminar5.builder;

public class Supererou {

    private String nume;
    private int puncteViata;
    private boolean esteNegativ;
    private boolean esteRanitGrav;

    private InterfataArma armaStanga;
    private InterfataArma armaDreapta;
    private InterfataSuperputere superputere;
    private InterfataSuperputere supeSuperputere;

    private Supererou() {

    }

    private Supererou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga, InterfataArma armaDreapta, InterfataSuperputere superputere, InterfataSuperputere supeSuperputere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteNegativ = esteNegativ;
        this.esteRanitGrav = esteRanitGrav;
        this.armaStanga = armaStanga;
        this.armaDreapta = armaDreapta;
        this.superputere = superputere;
        this.supeSuperputere = supeSuperputere;
    }

    public static class SupererouBuilder {
        Supererou supererou;

        public SupererouBuilder(String nume, int puncteViata) {
            this.supererou = new Supererou();
            this.supererou.nume = nume;
            this.supererou.puncteViata = puncteViata;
        }

        public SupererouBuilder esteNegativ() {
            this.supererou.esteNegativ = true;
            return this;
        }

        public SupererouBuilder esteRanitGrav(){
            this.supererou.esteRanitGrav = true;
            return this;
        }

        public SupererouBuilder setArmaStanga(InterfataArma arma){
            this.supererou.armaStanga = arma;
            return this;
        }

        public SupererouBuilder setArmaDreapta(InterfataArma arma){
            this.supererou.armaDreapta = arma;
            return this;
        }

        public SupererouBuilder setSuperputere(InterfataSuperputere superputere){
            this.supererou.superputere = superputere;
            return this;
        }

        public SupererouBuilder setSuperSuperputere(InterfataSuperputere superputere){
            this.supererou.supeSuperputere = superputere;
            return this;
        }

        public Supererou build(){
            return this.supererou;
        }

    }
}