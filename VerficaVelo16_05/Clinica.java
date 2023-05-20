package VerficaVelo16_05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Clinica {
    ArrayList<CartellaClinica> pazienti;

    public Clinica(){
        pazienti = new ArrayList<CartellaClinica>();
    }

    public void add(CartellaClinica p){
        pazienti.add(p);
    }

    public void rimuovi(String cognome){
        Iterator<CartellaClinica> it = pazienti.iterator();
        while(it.hasNext()){
            CartellaClinica p = it.next();
            if(p.getCognomePaziente().equals(cognome)){
                it.remove();
                System.out.println("Paziente rimosso");
                return;
            }
        }
        System.out.println("Paziente non trovato");
    }

    public String stampaClinica(){
        Iterator<CartellaClinica> it = pazienti.iterator();
        String s = "";
        while(it.hasNext()){
            CartellaClinica p = it.next();
            s += p.toString() + "\n";
        }
        return s;
    }

    public CartellaClinica cerca(String cognome){
        for(CartellaClinica p: pazienti){
            if(p.getCognomePaziente().equals(cognome)){
                System.out.println(p.toString());
                return p;
            }
        }
        System.out.println("Paziente non trovato");
        return null;
    }

    public void ordina(){
        Collections.sort(pazienti);
    }

    public boolean isEmpty(){
        return pazienti.isEmpty();
    }
}
