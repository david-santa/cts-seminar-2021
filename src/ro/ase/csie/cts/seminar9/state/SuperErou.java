package ro.ase.csie.cts.seminar9.state;

public class SuperErou {

    public static final int NIVEL_CRITIC = 10;

    String nume;
    int puncteViata;

    InterfataMiscare modMiscare = null;

    public SuperErou(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.modMiscare = new MiscareModNormal();
    }

    void seDeplaseaza(){
        this.modMiscare.seDeplaseaza();
    }

    void esteAtacat(int puncte){
        this.puncteViata -= puncte;
        if(this.puncteViata < NIVEL_CRITIC){
            this.modMiscare = new MiscareModRanit();
        }
    }

    void seVindeca(int puncte){
        this.puncteViata += puncte;
        if(this.puncteViata >= NIVEL_CRITIC)
            this.modMiscare = new MiscareModNormal();
    }
}
