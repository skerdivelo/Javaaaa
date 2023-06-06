package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DizionarioHashMap {
    private Map<String, String> dizionario;

    public DizionarioHashMap() {
        dizionario = new HashMap<>();
    }

    public void aggiungiParola(String parola, String significato) {
        dizionario.put(parola, significato);
    }

    public void cercaParola(String parola) {
        if (dizionario.containsKey(parola)) {
            String contrario = dizionario.get(parola);
            System.out.println("Il contrario di " + parola + " è: " + contrario);
        } else {
            System.out.println("Parola non trovata nel dizionario.");
        }
    }

    public void eliminaParola(String parola) {
        if (dizionario.containsKey(parola)) {
            dizionario.remove(parola);
            System.out.println("Parola eliminata correttamente.");
        } else {
            System.out.println("Parola non presente nel dizionario.");
        }
    }

    public void visualizzaDizionario() {
        System.out.println("Contenuto del dizionario:");
        for (Map.Entry<String, String> entry : dizionario.entrySet()) {
            String parola = entry.getKey();
            String contrario = entry.getValue();
            System.out.println(parola + " => " + contrario);
        }
    }
}
