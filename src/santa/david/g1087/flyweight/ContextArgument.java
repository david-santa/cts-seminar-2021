package santa.david.g1087.flyweight;

public class ContextArgument {
    String descriere;
    int IDAutor;

    public ContextArgument(String descriere, int IDAutor) {
        this.descriere = descriere;
        this.IDAutor = IDAutor;
    }

    public String getDescriere() {
        return descriere;
    }

    public int getIDAutor() {
        return IDAutor;
    }
}
