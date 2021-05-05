package santa.david.g1087.builder;

public class Dezbatere {
    private int id;
    private String titlu;
    private String categorie;
    private String urlImagine;
    private String[] taguri;

    private Dezbatere() {

    }

    private Dezbatere(int id, String titlu, String categorie, String urlImagine, String[] taguri) {
        this.id = id;
        this.titlu = titlu;
        this.categorie = categorie;
        this.urlImagine = urlImagine;
        this.taguri = taguri;
    }

    public int getId() {
        return this.id;
    }

    public static class DezbatereBuilder {
        Dezbatere dezbatere;

        public DezbatereBuilder(String titlu, String categorie) {
            this.dezbatere = new Dezbatere();
            this.dezbatere.id = generareId();
            this.dezbatere.titlu = titlu;
            this.dezbatere.categorie = categorie;
        }

        public DezbatereBuilder setUrlImagine(String url) {
            this.dezbatere.urlImagine = url;
            return this;
        }

        public DezbatereBuilder setTaguri(String[] taguri) {
            this.dezbatere.taguri = taguri;
            return this;
        }

        public Dezbatere build() {
            System.out.println("A fost construita dezbaterea cu ID " + this.dezbatere.id);
            return this.dezbatere;
        }

        private int generareId() {
            return (int) (Math.random() * 100);
        }
    }
}
