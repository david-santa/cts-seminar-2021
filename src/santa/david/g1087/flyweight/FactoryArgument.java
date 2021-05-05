package santa.david.g1087.flyweight;

import java.util.HashMap;

public class FactoryArgument {
    static HashMap<String, InterfataArgumentF> argumente = new HashMap<>();

    static{
        String[] listaArgumente = new String[] {"pro","contra","neutru"};
        for(String argument : listaArgumente){
            ArgumentF argumentF = new ArgumentF(argument);
            argumente.put(argument,argumentF);
        }
    }

    public static InterfataArgumentF getArgumentF(String tip){
        return argumente.get(tip);
    }
}
