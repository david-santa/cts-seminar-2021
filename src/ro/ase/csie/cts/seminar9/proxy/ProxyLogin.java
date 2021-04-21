package ro.ase.csie.cts.seminar9.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogin {

    public static final int NR_MAX_INCERCARI = 3;
    public Map<String, Integer> nrInercari = new HashMap<>();

    InterfataModulLogin modulLogin = null;

    public ProxyLogin(InterfataModulLogin modulLogin) {
        this.modulLogin = modulLogin;
    }

    @Override
    public boolean login(String username, String password) {
        Integer nrIncercariNereusite = nrInercari.get(username);
        if (nrIncercariNereusite == null) {
            nrInercari.put(username, 0);
            nrIncercariNereusite = 0;
        }

        if (modulLogin != null) {
            if (nrIncercariNereusite < NR_MAX_INCERCARI) {
                if (modulLogin.login(username, password) == true) {
                    nrIncercariNereusite = 0;
                    return true;
                } else {
                    nrIncercariNereusite++;
                    return false;
                }
            } else {
                return false;
            }
        } else throw new UnsupportedOperationException();
    }

    @Override
    public boolean verificaStatusServer() {
        if (modulLogin != null)
            return modulLogin.verificaStatusServer();
        else
            return false;
    }
}
