package ro.ase.csie.cts.seminar6.dp.simplefactory.FactoryMethod;

import ro.ase.csie.cts.seminar6.dp.simplefactory.SupererouAbstract;
import ro.ase.csie.cts.seminar6.dp.simplefactory.TipErou;

public abstract class FactoryAbstract {

    public abstract SupererouAbstract getSuperErou(TipErou tip, String nume);
}
