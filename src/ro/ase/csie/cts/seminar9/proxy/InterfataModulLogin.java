package ro.ase.csie.cts.seminar9.proxy;

public interface InterfataModulLogin {
    boolean login(String username, String password);
    boolean verificaStatusServer();
}
