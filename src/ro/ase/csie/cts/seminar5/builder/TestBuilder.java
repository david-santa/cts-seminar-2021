package ro.ase.csie.cts.seminar5.builder;

public class TestBuilder {
    public static void main(String[] args) {
//        1. construire obiect
//        Supererou supererou = new Supererou();
//        2. initializare
//        supererou.nume = "Tecsor Bogdan";
//
//        new Supererou("Tatu Andrei",100,false,false,new Arma(),null,null,null);


        Supererou superTecsor = new Supererou.SupererouBuilder("superTecsor",100)
                .setArmaDreapta(new Arma())
                .build();

        Supererou superBodi = new Supererou.SupererouBuilder("superBodi",200)
                .esteNegativ()
                .esteRanitGrav()
                .setArmaDreapta(new Arma())
                .build();
    }
}
