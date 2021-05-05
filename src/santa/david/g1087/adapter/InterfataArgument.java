package santa.david.g1087.adapter;

public abstract class InterfataArgument {
    String titlu;
    int idDezbatere;

    public abstract void posteazaArgument();

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setIdDezbatere(int idDezbatere) {
        this.idDezbatere = idDezbatere;
    }
}
