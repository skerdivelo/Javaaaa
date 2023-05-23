package Paninoteca;

import java.util.ArrayList;
import java.util.Collections;

public class Paninoteca {
    ArrayList<Panino> panini = new ArrayList<Panino>();

    public void aggiungiPanino(Panino panino) {
        panini.add(panino);
    }

    public void rimuoviPanino(Panino panino) {
        if (panini.contains(panino)) {
            panini.remove(panino);
        }
    }

    public ArrayList<Panino> getPanini() {
        return panini;
    }

    public String toString() {
        String s = "";
        for (Panino panino : panini) {
            s += panino.toString() + "\n";
        }
        return s;
    }

    public void ordinaPanini() {
        Collections.sort(panini);
    }
}
