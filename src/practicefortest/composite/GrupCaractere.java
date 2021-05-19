package practicefortest.composite;

import java.util.ArrayList;

public class GrupCaractere extends NodAbstract{

    ArrayList<NodAbstract> noduri = new ArrayList<>();
    String denumire;

    public GrupCaractere(String denumire) {
        super();
        this.denumire = denumire;
    }

    @Override
    public void atacaJucator(String numeJucator) {
        for (NodAbstract nodAbstract : noduri) {
            nodAbstract.atacaJucator(numeJucator);
        }
    }

    @Override
    public void seRetrage() {
        for (NodAbstract nodAbstract : noduri) {
            nodAbstract.seRetrage();
        }
    }

    @Override
    public void seDeplaseaza() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adaugaNod(NodAbstract nod) {
        this.noduri.add(nod);
    }

    @Override
    public void stergeNod(NodAbstract nod) {
        this.noduri.remove(nod);
    }

    @Override
    public NodAbstract getNod(int index) {
        return this.noduri.get(index);
    }
}
