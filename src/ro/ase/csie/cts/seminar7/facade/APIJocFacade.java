package ro.ase.csie.cts.seminar7.facade;

public class APIJocFacade {
    static ProfilJucator getProfil(String ipServer, int port, String numeUtilizator, String parola){
        ServerJoc server = new ServerJoc(ipServer,port);
        if(server.conectare()){
            Utilizator utilizator = new Utilizator();
            utilizator.login(numeUtilizator,parola);
            ProfilJucator profil = utilizator.getProfil();
            return profil;
        }
        else
            return null;
    }
}
