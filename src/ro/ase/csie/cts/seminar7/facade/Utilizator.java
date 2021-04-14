package ro.ase.csie.cts.seminar7.facade;

public class Utilizator {

    void login(String username, String password){
        System.out.println("login");
    }

    public ProfilJucator getProfil(){
        return new ProfilJucator();
    }
}
