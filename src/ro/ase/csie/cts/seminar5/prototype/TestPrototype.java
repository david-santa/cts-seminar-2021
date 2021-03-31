package ro.ase.csie.cts.seminar5.prototype;

public class TestPrototype {
    public static void main(String[] args) {

        Model3DCaracter superTecsor = new Model3DCaracter("albastru");
        Model3DCaracter superTecsorCopia = new Model3DCaracter("albastru");

        try {
            Model3DCaracter superTecsorCopieClonata = (Model3DCaracter) superTecsor.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
