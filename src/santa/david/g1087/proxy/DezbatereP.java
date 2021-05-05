package santa.david.g1087.proxy;

public class DezbatereP implements InterfataDezbatereP {
    String titlu;
    String[] categoriiRaspunsuri = {"pro", "contra"};

    public DezbatereP(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public void seteazaCategoriiRaspunsuri(String[] categoriiRaspunsuri) {
        this.categoriiRaspunsuri = categoriiRaspunsuri;
    }

    @Override
    public void publica() {
        System.out.print("Dezbaterea cu titlul " + titlu + " si variantele de raspuns ");
        for (String categorie : categoriiRaspunsuri) {
            System.out.print(categorie + " ");
        }
        System.out.print("a fost publicata!");
    }
}
