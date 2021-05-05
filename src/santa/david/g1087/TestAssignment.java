package santa.david.g1087;

import santa.david.g1087.adapter.AdaptorVideoLaArgument;
import santa.david.g1087.adapter.ArgumentVideo;
import santa.david.g1087.builder.Dezbatere;
import santa.david.g1087.decorator.ArgumentD;
import santa.david.g1087.decorator.DescriereArgumentD;
import santa.david.g1087.decorator.InterfataArgumentD;
import santa.david.g1087.factory.ArgumentContra;
import santa.david.g1087.factory.ArgumentFactory;
import santa.david.g1087.factory.ArgumentPro;
import santa.david.g1087.factory.InterfataArgument;
import santa.david.g1087.flyweight.ContextArgument;
import santa.david.g1087.flyweight.FactoryArgument;
import santa.david.g1087.flyweight.InterfataArgumentF;
import santa.david.g1087.prototype.ListaDezbateri;
import santa.david.g1087.proxy.DezbatereP;
import santa.david.g1087.proxy.InterfataDezbatereP;
import santa.david.g1087.proxy.ProxyDezbatere;
import santa.david.g1087.singleton.SingletonLogger;

import java.util.ArrayList;

public class TestAssignment {
    public static void main(String[] args) {
        /**
         * SINGLETON
         */
        SingletonLogger logger = SingletonLogger.LOGGER;
        logger.log("Connection established");

        /**
         * BUILDER
         */

        Dezbatere dezbatere1 = new Dezbatere.DezbatereBuilder("Dezbatere generica", "politica").setUrlImagine("https://imagini.com/imagine.jpg").build();

        /**
         * FACTORY
         */
        InterfataArgument argumentPro = ArgumentFactory.creareArgument("pro", "Argument pro generic", dezbatere1.getId());
        InterfataArgument argumentContra = ArgumentFactory.creareArgument("CONTRA", "Argument contra generic", 12);
        argumentContra.posteazaArgument();
        argumentPro.posteazaArgument();

        /**
         * PROTOTYPE
         */

        ListaDezbateri listaDezbateri = new ListaDezbateri("politica");
        try {
            ListaDezbateri listaPolitica = (ListaDezbateri) listaDezbateri.clone();
        } catch (CloneNotSupportedException e) {
        }

        /**
         * ADAPTER
         */

        ArrayList<InterfataArgument> argumente = new ArrayList<>();
        argumente.add(argumentPro);
        ArgumentVideo video = new ArgumentVideo(2, 5.3f, "youtube.com/watch?v=argument", "pro");
        argumente.add(new AdaptorVideoLaArgument(video, "titlu", 2));
        for (InterfataArgument argument : argumente) {
            argument.posteazaArgument();
        }

        /**
         * DECORATOR
         */

        InterfataArgumentD argumentD = new DescriereArgumentD(new ArgumentD("pro"), "aceasta este o descriere");
        System.out.println(argumentD.decorate());

        /**
         * FLYWEIGHT
         */

        ContextArgument contextArgument1 = new ContextArgument("descriere1", 12);
        ContextArgument contextArgument2 = new ContextArgument("descriere2", 1);

        InterfataArgumentF argumentProFly = FactoryArgument.getArgumentF("pro");
        argumentProFly.posteaza(contextArgument1);
        argumentProFly.posteaza(contextArgument2);

        /**
         * PROXY
         */

        InterfataDezbatereP dezbatereP = new DezbatereP("Care este orientarea dvs. politica?");
        dezbatereP = new ProxyDezbatere(dezbatereP);
        dezbatereP.seteazaCategoriiRaspunsuri(new String[]{"stanga", "dreapta", "centru"});
        dezbatereP.publica();
    }
}
