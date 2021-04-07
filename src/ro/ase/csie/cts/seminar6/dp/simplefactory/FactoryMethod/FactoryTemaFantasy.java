package ro.ase.csie.cts.seminar6.dp.simplefactory.FactoryMethod;

import ro.ase.csie.cts.seminar6.dp.simplefactory.*;

public class FactoryTemaFantasy extends FactoryAbstract{
    @Override
    public SupererouAbstract getSuperErou(TipErou tip, String nume) {
        SupererouAbstract supererou = null;
        switch(tip){
            case DISNEY:
                supererou = new CaracterFantasyDisney(nume,100);
                break;
            case DC:
                supererou = new CaracterFantasyDC(nume,500);
                break;
            case MARVEL:
                supererou = new CaracterFantasyMarvel(nume,250);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return supererou;
    }
}
