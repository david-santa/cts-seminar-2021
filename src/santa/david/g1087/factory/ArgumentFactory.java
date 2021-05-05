package santa.david.g1087.factory;

import java.util.Locale;

public class ArgumentFactory {
    public static InterfataArgument creareArgument(String tipArgument, String titlu, int idDezbatere) {
        InterfataArgument argument = null;

        switch (tipArgument.toLowerCase(Locale.ROOT)) {
            case "pro":
                argument = new ArgumentPro();
                argument.setTitlu(titlu);
                argument.setIdDezbatere(idDezbatere);
                break;
            case "contra":
                argument = new ArgumentContra();
                argument.setTitlu(titlu);
                argument.setIdDezbatere(idDezbatere);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return argument;
    }
}
