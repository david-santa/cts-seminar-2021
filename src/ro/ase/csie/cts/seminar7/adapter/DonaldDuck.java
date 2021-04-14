package ro.ase.csie.cts.seminar7.adapter;

public class DonaldDuck implements ActiuniDisney{

    public static final String DENUMIRE = "Donald Duck";
    int power;

    @Override
    public String getNume() {
        return DENUMIRE;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Repozitionare caracter la noile coordonate");
    }

    @Override
    public void primesteLovitura(int power) {
        this.power -= power;
        System.out.println("Nivel putere scazut la " + this.power);
    }

    @Override
    public void reincarca(int power) {
        this.power += power;
        System.out.println("Nivel putere crescut la " + this.power);
    }

    @Override
    public void jump() {
        System.out.println("Saritura");
    }
}
