package ro.ase.csie.cts.seminar9.proxy;

public class TestProxy {
    public static void main(String[] args) {

        InterfataModulLogin login = new ModulLogin("10.0.0.1",127);

        login = new ProxyLogin(login);

        String[] parole = new String[]{"1234","123456","admin","root","admin12"};
        for(String parola : parole){
            if(login.login("admin",parola))
                System.out.println("Parola gasta: " + parola);
        }
    }
}
