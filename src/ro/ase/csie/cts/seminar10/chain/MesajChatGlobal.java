package ro.ase.csie.cts.seminar10.chain;

public class MesajChatGlobal extends NodChainAbstract{
    public MesajChatGlobal() {
        super("Modul Chat Global");
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")){
            System.out.println("Mesaj catre toti jucatorii: " + mesaj.getContinut());
        }

        if(this.next != null){
            this.next.procesareMesajChat(mesaj);
        }
    }
}