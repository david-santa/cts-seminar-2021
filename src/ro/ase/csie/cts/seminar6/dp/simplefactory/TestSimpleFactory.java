package ro.ase.csie.cts.seminar6.dp.simplefactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
//         SupererouAbstract supererou = new CaracterDisney("Donald Duck",100, false);
//
//         supererou = new CaracterMarvel("Spiderman",150,50);
//         supererou = new CaracterDC("Batman",150,22);

         SupererouAbstract superCaracter = FactorySuperErou.getSupererou(TipErou.DISNEY,"Mickey Mouse");
         superCaracter = FactorySuperErou.getSupererou(TipErou.MARVEL,"Spiderman");
         superCaracter = FactorySuperErou.getSupererou(TipErou.DC,"Batman");
    }
}
