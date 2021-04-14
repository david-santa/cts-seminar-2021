package ro.ase.csie.cts.seminar7.decorator;

import ro.ase.csie.cts.seminar7.adapter.ACMECaracterJoc;
import ro.ase.csie.cts.seminar7.adapter.CaracterFantastic;

public class TestDecorator {
    public static void main(String[] args) {
        ACMECaracterJoc dragon = new CaracterFantastic("Dragonul albastru", 400);

        dragon = new DecoratorScut(dragon,200);
        dragon.esteLovit(300);
        dragon = new DecoratorRanit(dragon);
        dragon.esteLovit(550);
        dragon.seDeplaseaza();
    }
}
