package br.jus.tjes;

import java.util.List;

public class Controller {
    public void iniciar() {
        List<String> lista = null;

        try {
            lista.add("Ola");
        } catch (NullPointerException ex) {
            Log.getLogger().info("Controller", ex);
        }
    }
}
