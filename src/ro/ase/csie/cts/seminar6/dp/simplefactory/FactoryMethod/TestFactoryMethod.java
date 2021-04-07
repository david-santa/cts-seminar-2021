package ro.ase.csie.cts.seminar6.dp.simplefactory.FactoryMethod;

import ro.ase.csie.cts.seminar6.dp.simplefactory.FactorySuperErou;
import ro.ase.csie.cts.seminar6.dp.simplefactory.SupererouAbstract;
import ro.ase.csie.cts.seminar6.dp.simplefactory.TipErou;

public class TestFactoryMethod {
    public static void main(String[] args) {
        boolean esteTemaFantasy = true;

        FactoryAbstract factoryCaractere = null;
        if(esteTemaFantasy){
            factoryCaractere = new FactoryTemaFantasy();
        }
        else{
            factoryCaractere = new FactoryTemaUniversala();
        }

        SupererouAbstract superCaracter = factoryCaractere.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
        superCaracter = factoryCaractere.getSuperErou(TipErou.MARVEL, "Spiderman");
        superCaracter = factoryCaractere.getSuperErou(TipErou.DC, "Batman");
    }
}
