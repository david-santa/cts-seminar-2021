package practicefortest.strategy;

public class Calator implements ICalator{

    String nume;

    InterfataStrategie strategie = null;

    public Calator(String nume) {
        this.nume = nume;
    }

    public void setStrategie(InterfataStrategie strategie) {
        this.strategie = strategie;
    }

    @Override
    public void calatoreste(int nrZone) {
            if(nrZone<1) throw new UnsupportedOperationException();
            else if(nrZone==1) this.setStrategie(new StrategieAutobuz());
            else if(nrZone==2) this.setStrategie(new StrategieTramvai());
            else if(nrZone==3) this.setStrategie(new StrategieMetrou());
            else this.setStrategie(new StrategieTren());

        System.out.println("Calatorul " + nume + " calatoreste cu " + strategie.getMijlocTransport() );
    }
}
