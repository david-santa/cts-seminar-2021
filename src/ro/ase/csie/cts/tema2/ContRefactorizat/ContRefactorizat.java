package ro.ase.csie.cts.tema2.ContRefactorizat;

public class ContRefactorizat {
    private Imprumut imprumut;
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

    public static double calculeazaComisionTotal(ContRefactorizat[] conturi) {
        double comisionTotal = 0.0;
        final float brokerFee = 0.0125f;
        ContRefactorizat cont;
        for (int i = 0; i < conturi.length; i++) {
            cont = conturi[i];
            if (cont.tipCont == TipCont.PREMIUM || cont.tipCont == TipCont.SUPER_PREMIUM) {
                float procentZileActiveDinAn = (float) cont.zileActiv / 365;
                double comision = cont.imprumut.getValoareImprumut() * Math.pow(cont.imprumut.getRata(), procentZileActiveDinAn) - cont.imprumut.getValoareImprumut();
                double dobandaPrincipala = brokerFee * comision;
                comisionTotal += dobandaPrincipala;
            }
        }
        return comisionTotal;
    }
}
