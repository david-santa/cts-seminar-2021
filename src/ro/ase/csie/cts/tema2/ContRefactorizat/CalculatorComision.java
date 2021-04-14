package ro.ase.csie.cts.tema2.ContRefactorizat;

public class CalculatorComision {
    public static double calculeazaComisionTotal(ContRefactorizat[] conturi) {
        double comisionTotal = 0.0;
        final float brokerFee = 0.0125f;
        ContRefactorizat cont;
        for (int i = 0; i < conturi.length; i++) {
            cont = conturi[i];
            if (cont.getTipCont() == TipCont.PREMIUM || cont.getTipCont() == TipCont.SUPER_PREMIUM) {
                float procentZileActiveDinAn = (float) cont.getZileActiv() / 365;
                double comision = cont.imprumut.getValoareImprumut() * Math.pow(cont.imprumut.getRata(), procentZileActiveDinAn) - cont.imprumut.getValoareImprumut();
                double dobandaPrincipala = brokerFee * comision;
                comisionTotal += dobandaPrincipala;
            }
        }
        return comisionTotal;
    }
}
