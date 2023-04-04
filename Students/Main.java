package Students;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();
        Studente s1 = new Studente("Mario", "Rossi", 10, 8, 9);
        Studente s2 = new Studente("Luigi", "Verdi", 6, 7, 8);
        Studente s3 = new Studente("Pippo", "Bianchi", 9, 10, 8);
        Studente s4 = new Studente("Pluto", "Gialli", 7, 6, 8);

        listaStudenti.add(s1);
        listaStudenti.add(s2);
        listaStudenti.add(s3);
        listaStudenti.add(s4);

        //iteratore che elimina chi ha la media < 6
        Iterator<Studente> it = listaStudenti.iterator();
        while(it.hasNext()){
            Studente studente = it.next();
            if(studente.getMedia() < 6){
                it.remove();
            }
        }
    }
}
