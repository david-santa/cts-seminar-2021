package santa.david.g1087.proxy;

public class ProxyDezbatere implements InterfataDezbatereP {
    InterfataDezbatereP dezbatere = null;
    String[] categoriiRaspunsuri;

    public ProxyDezbatere(InterfataDezbatereP dezbatere) {
        this.dezbatere = dezbatere;
        this.categoriiRaspunsuri = new String[]{"pro", "contra"};
    }

    @Override
    public void seteazaCategoriiRaspunsuri(String[] categoriiRaspunsuri) {
        dezbatere.seteazaCategoriiRaspunsuri(categoriiRaspunsuri);
    }

    @Override
    public void publica() {
        dezbatere.publica();
    }
}
