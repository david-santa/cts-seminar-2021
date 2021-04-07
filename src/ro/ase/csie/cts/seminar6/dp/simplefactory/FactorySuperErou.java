package ro.ase.csie.cts.seminar6.dp.simplefactory;

public class FactorySuperErou {

    public static SupererouAbstract getSupererou(TipErou tip, String nume){
        SupererouAbstract supererou = null;
        switch(tip){
            case DISNEY:
                supererou = new CaracterDisney(nume,100,false);
                break;
            case DC:
                supererou = new CaracterDC(nume,500,50);
                break;
            case MARVEL:
                supererou = new CaracterMarvel(nume,250,0);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return supererou;
    }
}
