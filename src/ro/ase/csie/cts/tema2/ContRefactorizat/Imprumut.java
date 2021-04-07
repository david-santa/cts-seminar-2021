package ro.ase.csie.cts.tema2.ContRefactorizat;

public class Imprumut implements InterfataRataLunara {
    private double valoareImprumut;
    private double rata;

    public Imprumut(double valoareImprumut, double rata) throws NegativeValueException {
        if (valoareImprumut < 0)
            throw new NegativeValueException("Valoare negativa");
        this.valoareImprumut = valoareImprumut;
        this.rata = rata;
    }

    @Override
    public double getRataLunara() {
        return valoareImprumut * rata;
    }

    @Override
    public String toString() {
        return "Imprumut: " + this.valoareImprumut + "; rata: " + this.rata;
    }

    public double getValoareImprumut() {
        return valoareImprumut;
    }

    public double getRata() {
        return this.rata;
    }

    public void setValoare(double valoare) throws NegativeValueException {
        if (valoare < 0)
            throw new NegativeValueException("Valoare negativa");
        this.valoareImprumut = valoare;
    }
}
