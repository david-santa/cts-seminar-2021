package practicefortest.composite;

public class CaracterNPC extends NodAbstract implements InterfataCaractereNPC{
    String nume;
    int putere;

    public CaracterNPC(String nume, int putere){
        super();
        this.nume = nume;
        this.putere = putere;
    }

    @Override
    public void atacaJucator(String numeJucator) {
        System.out.printf("%s ataca pe %s%n",nume,numeJucator);
    }

    @Override
    public void seRetrage() {
        System.out.printf("%s se retrage%n",nume);
    }

    @Override
    public void seDeplaseaza() {
        System.out.printf("%s se deplaseaza pe ecran", nume);
    }

    @Override
    public void adaugaNod(NodAbstract nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(NodAbstract nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NodAbstract getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
