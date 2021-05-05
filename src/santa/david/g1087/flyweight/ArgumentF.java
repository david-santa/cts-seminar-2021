package santa.david.g1087.flyweight;

import santa.david.g1087.factory.InterfataArgument;

public class ArgumentF extends InterfataArgumentF {
    String tip; //pro sau contra


    public ArgumentF(String tip) {
        this.tip = tip;
    }

    @Override
    public void posteaza(ContextArgument context) {
        System.out.println("Argument flyweight " + tip + " postat cu descrierea: \"" + context.getDescriere() + "\" de carte utilizatorul cu ID-ul " + context.getIDAutor());
    }
}
