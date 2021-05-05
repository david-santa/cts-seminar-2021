package santa.david.g1087.adapter;

import santa.david.g1087.factory.InterfataArgument;

import java.util.Locale;

public class AdaptorVideoLaArgument extends InterfataArgument {

    ArgumentVideo video = null;
    String titlu;
    int idDezbatere;

    public AdaptorVideoLaArgument(ArgumentVideo video, String titlu, int idDezbatere) {
        super();
        this.video = video;
        this.titlu = titlu;
        this.idDezbatere = idDezbatere;
    }

    @Override
    public void posteazaArgument() {
        System.out.println("Argument video " + video.tipArgument.toUpperCase(Locale.ROOT) + " postat");
    }
}
