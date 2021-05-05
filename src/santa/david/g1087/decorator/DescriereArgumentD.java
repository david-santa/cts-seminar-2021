package santa.david.g1087.decorator;

public class DescriereArgumentD extends DecoratorArgumentD {
    private String descriere;
    public DescriereArgumentD(InterfataArgumentD argument, String descriere) {
        super(argument);
        this.descriere = descriere;
    }

    public String decorate(){
        return super.decorate() + decorateDescriere();
    }

    private String decorateDescriere() {
        return " cu descrierea " + "\"" + descriere +"\"";
    }
}
