package Notaio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AcquirenteLista implements Comparator<Acquirente> {
    ArrayList<Acquirente> acquirenti = new ArrayList<Acquirente>();

    public void aggiungiAcquirente(Acquirente a) {
        acquirenti.add(a);
    }

    public void rimuoviAcquirente(Acquirente a) {
        acquirenti.remove(a);
    }  

    @Override
    public int compare(Acquirente o1, Acquirente o2) {
        if(o1.getCognome().compareTo(o2.getCognome()) == 0) {
            System.out.println("Cognomi uguali");
            return o1.getNome().compareTo(o2.getNome());
        }else{
            System.out.println("Cognomi diversi");
            return o1.getCognome().compareTo(o2.getCognome());
        }
    }

    public void ordinaCognome() {
        //calciatori.sort(Comparatore.comparing(Calciatore::getNome));
        Collections.sort(acquirenti, this);
    }

    public void stampaAcquirenti() {
        Collections.sort(acquirenti, this);
        Iterator<Acquirente> it = acquirenti.iterator();
        while (it.hasNext()) {
            Acquirente a = it.next();
            System.out.println(a.getCognome() + " " + a.getNome() + " " + a.getEmail() + " " + a.getTelefono() + " " + a.getChiVende() + " " + a.getRenditaCatastale() + " " + a.getPrezzo() + " " + a.getCaparra() + " " + a.isAcquistoConMutuo());
        }
    }
}
