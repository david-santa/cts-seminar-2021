package santa.david.g1087.prototype;
import java.util.ArrayList;

public class ListaDezbateri {
    ArrayList<Dezbatere> listaDezbateri = new ArrayList<>();

    public ListaDezbateri(String categorie) {
        System.out.println("Obtinere lista dezbateri din baza de date pentru categoria: " + categorie);
        System.out.println("VA RUGAM ASTEPTATI 3 SECUNDE ...");
        try {
            Thread.sleep(3000);
            for (int i = 0; i < 4; i++) {
                this.listaDezbateri.add(new Dezbatere.DezbatereBuilder("Titlu" + i, categorie).build());
            }
        } catch (InterruptedException e) {
        }
    }

    private ListaDezbateri() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ListaDezbateri copie = new ListaDezbateri();
        copie.listaDezbateri = (ArrayList<Dezbatere>) this.listaDezbateri.clone();
        return copie;
    }
}
