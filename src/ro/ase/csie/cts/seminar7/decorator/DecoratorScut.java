package ro.ase.csie.cts.seminar7.decorator;

import ro.ase.csie.cts.seminar7.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter{

    int nivelScut;

    public DecoratorScut(ACMECaracterJoc caracterJoc, int nivel) {
        super(caracterJoc);
        this.nivelScut = nivel;
    }

    @Override
    public void esteLovit(int puncte) {
        int puncteLovitura = puncte - this.nivelScut;
        if(puncteLovitura > 0)
            this.esteLovit(puncteLovitura);
    }
}
