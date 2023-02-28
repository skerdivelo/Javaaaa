package Verifica_Velo28_02;

import java.io.*;

public class Magazzino {
    private Articolo[] articoli; //creo il vettore
    private static int MAX_ELEMENTI = 100; //dimensione vettore
    private int numElementi; //numero di elementi nel vettore
    private int codiceID = 1; //contatore degli elementi
    private static int PESO_MINORE_10KG = 5; //SE PESO MINORE PAGO 5
    private static int PESO_MAGGIORE_10KG = 10; //SE PESO MAGGIORE PAGO 10
    private static int PESO_RIFERIMENTO = 10; //QUESTO VIENE USATO NELLE IF COSI' DA NON AVERE NUMERI VOLANTI

    //costruttore
    public Magazzino(){
        this.articoli = new Articolo[MAX_ELEMENTI];
        this.numElementi = 0;
    }

    //verifico se è vuoto
    public boolean isEmpty(){
        return numElementi == 0;
    }

    //aggiungo un oggetto nel vettore;
    public void aggiungiArticolo(Articolo a){
        //verifico che il mio contatore (numElementi) non si maggiore della dimensione
        if(numElementi<MAX_ELEMENTI){
            articoli[numElementi] = new Articolo(a); //aggiungo l'oggetto
            articoli[numElementi].setCodice(codiceID); //setto il codice
            codiceID++; //incremento il codice
            numElementi++; //incremento il numero di elementi
        }
    }

    public Articolo rimuoviArticolo(String nome){
        if(!isEmpty()){
            int i = 0; //contatore
            boolean trovato = false; //bool che verifica se è stato trovato l'oggetto all'interno del vettore
            try{
                //scorro il vettore
                while(i<numElementi){
                    if(articoli[i].getNome().equalsIgnoreCase(nome)){ 
                        trovato = true; //se lo trova esce
                        break;
                    }
                    i++;
                }
                if(trovato){
                    Articolo a = new Articolo(articoli[i]); //creo un oggetto di tipo articolo
                    for(int j = i; j<numElementi-1; j++){
                        articoli[j] = articoli[j+1]; //scorro il vettore e sposto a sinistra
                    }
                    //cambio il codice
                    for(int j = i; j<numElementi-1; j++){
                        articoli[j].setCodice(j + 1);
                    }
                    numElementi--; //decremento il numero di elementi
                    articoli[numElementi] = null; //setto l'ultimo elemento a null
                    return a;
                }else{
                    return null;
                }
            }catch (Exception e){
                return null;
            }
        }else{
            return null;
        }
    }
    public String visualizzaInfo(String nome){
        if(!isEmpty()){
            int i = 0; //contatore
            boolean trovato = false; //bool che verifica se è stato trovato l'oggetto all'interno del vettore
            try{
                //scorro il vettore
                while(i<numElementi){
                    if(articoli[i].getNome().equalsIgnoreCase(nome)){ 
                        trovato = true; //se lo trova esce
                        break;
                    }
                    i++;
                }
                if(trovato){
                    return articoli[i].toString(); //ritorno la stringa
                }else{
                    return "Articolo non trovato";
                }
            }catch (Exception e){
                return "Errore";
            }
        }else{
            return "Vettore vuoto";
        }
    }
    public double vendiArticolo(String nome){
        if(!isEmpty()){
            int i = 0; //contatore
            double prezzoDaPagare = 0; // quanto devo pagare
            boolean trovato = false; //bool che verifica se è stato trovato l'oggetto all'interno del vettore
            try{
                //scorro il vettore
                while(i<numElementi){
                    if(articoli[i].getNome().equalsIgnoreCase(nome)){ 
                        trovato = true; //se lo trova esce
                        break;
                    }
                    i++;
                }
                if(trovato){
                    if(articoli[i].getPeso()<=PESO_RIFERIMENTO){
                        prezzoDaPagare = (articoli[i].getPeso()*PESO_MINORE_10KG)+articoli[i].getPrezzo();
                    }else{
                        prezzoDaPagare = (articoli[i].getPeso()*PESO_MAGGIORE_10KG)+articoli[i].getPrezzo();
                    }
                    rimuoviArticolo(nome); //rimuovo siccome l'ho venduto
                    return prezzoDaPagare;
                }else{
                    System.out.println("");
                    return 0;
                }
            }catch (Exception e){
                System.out.println("Errore");
                return 0;
            }
        }else{ //se è vuoto
            System.out.println("Il vettore è vuoto, inserisci un articolo");
            return 0;
        }
    }
    
    //stampo tutto il vettore
    public void stampaMagazzino(){
        if(!isEmpty()){
            for(int i = 0; i < numElementi; i++){
                System.out.println(articoli[i].toString());
            }
        }else{ //se è vuoto
            System.out.println("Il vettore è vuoto, inserisci un articolo");
        }
    }

    //salvo in un file giacenza.bin
    public void salvaGiacenza(){
        try{
            FileOutputStream fos = new FileOutputStream("giacenza.bin"); //apro il file
            ObjectOutputStream oos = new ObjectOutputStream(fos); //scrivo nel file
            for(int i = 0; i < numElementi; i++){
                oos.writeObject(articoli[i].toString()); //scrivo nel file
            }
            oos.close();
            fos.close();
        }catch (IOException e){
            System.out.println("Errore");
        }
    }

    //carico il file giacenza.bin
    public void caricaGiacenza(){
        try{
            FileInputStream fis = new FileInputStream("giacenza.bin"); //apro il file
            ObjectInputStream ois = new ObjectInputStream(fis); //leggo il file
            ois.readObject(); //leggo il file
            ois.close(); //chiudo il file
            fis.close(); //chiudo il file
        }catch (IOException e){ //se non trova il file
            System.out.println("Errore"); //errore
        }catch (ClassNotFoundException e){ //se non trova la classe
            System.out.println("Errore");
        }
    }

}
