package ro.ase.csie.cts.tema2.ContRefactorizat;

public class ContRefactorizat {
    protected Imprumut imprumut;
    private int zileActiv;
    private TipCont tipCont;

    public ContRefactorizat(Imprumut imprumut, TipCont tipCont) throws NegativeValueException {
        this.imprumut = imprumut;
        this.tipCont = tipCont;
        this.zileActiv = 1;
    }

    @Override
    public String toString() {
        return imprumut.toString() + "; zile activ:" + zileActiv + "; tip: " + tipCont + ";";
    }

    public int getZileActiv() {
        return zileActiv;
    }

    public TipCont getTipCont() {
        return tipCont;
    }

    public Imprumut getImprumut() {
        return imprumut;
    }

    public void setImprumut(Imprumut imprumut) {
        this.imprumut = imprumut;
    }
}
