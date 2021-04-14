package ro.ase.csie.cts.seminar7.adapter;

public class CaracterFantastic extends ACMECaracterJoc{
    public CaracterFantastic(String nume, int puncteViata) {
        super(nume, puncteViata);
    }

    @Override
    public void seDeplaseaza() {
        System.out.println(String.format("%s se deplaseaza pe eran",nume));
    }

    @Override
    public void esteLovit(int puncte) {
        System.out.println(String.format("%s este lovit si pierde %d puncte",nume,puncte));
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.println(String.format("%s se vindeca si recupereaza %d puncte",nume,puncte));
    }
}