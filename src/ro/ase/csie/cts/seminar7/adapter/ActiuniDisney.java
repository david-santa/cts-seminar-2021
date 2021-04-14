package ro.ase.csie.cts.seminar7.adapter;

public interface ActiuniDisney {

    public String getNume();
    public int getPower();

    void move(int x, int y);
    void primesteLovitura(int power);
    void reincarca(int power);
    void jump();
}
