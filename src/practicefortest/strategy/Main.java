package practicefortest.strategy;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Dorian");
        calator.calatoreste(3);
        calator.calatoreste(1);
        calator.calatoreste(2);
        calator.calatoreste(4);
        calator.calatoreste(0);
    }
}
