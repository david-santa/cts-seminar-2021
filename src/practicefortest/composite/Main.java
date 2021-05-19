package practicefortest.composite;

public class Main {
    public static void main(String[] args) {
        GrupCaractere grup1 = new GrupCaractere("Grupul unu");
        grup1.adaugaNod(new CaracterNPC("Salbatic Devotat",100));
        grup1.adaugaNod(new CaracterNPC("Lup Salbatic",20));

        GrupCaractere grupBoss = new GrupCaractere("Grup sef");
        grupBoss.adaugaNod(new CaracterNPC("Dragon",1000));
        grupBoss.adaugaNod(grup1);

        grupBoss.atacaJucator("PsyDstr69420");
        grupBoss.seRetrage();
    }
}
