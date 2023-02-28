//import files for wrting and reading in .bin like BufferWriter, BufferReader, FileWriter, FileReader
import java.io.*;

public class Magazzino{
    private Articolo[] articoli;
    private int nArticoli;
    private static int maxArticoli = 100;
    private int codiceId = 1;
    private static int PESO_MINORE_10KG = 5;
    private static int PESO_MAGGIORE_10KG = 10;
    private static int PESO_RIFERIMENTO = 10;

    public Magazzino(){
        this.articoli = new Articolo[maxArticoli];
        this.nArticoli = 0;
    }

    //vettore vuoto?
    public boolean isEmpty(){
        return nArticoli == 0;
    }

    // Aggiunge un articolo al magazzino
    public void aggiungiArticolo(Articolo a){
        if(nArticoli < maxArticoli){
            articoli[nArticoli] = a;
            articoli[nArticoli].setCodice(codiceId);
            nArticoli++;
            codiceId++;
        }
    }

    //rimuove un articolo dal magazzino dato il nome
    public void rimuoviArticolo(String nome){
        int i = 0;
        boolean trovato = false;
        try{
            while(i < nArticoli){
                if(articoli[i].getNome().equals(nome)){
                    trovato = true;
                    break;
                }
                i++;
            }
            if(trovato){
                for(int j = i; j < nArticoli - 1; j++){
                    articoli[j] = articoli[j + 1];
                }
                nArticoli--;
                for(int k = 0; k < nArticoli; k++){
                    //System.out.println(k);
                    articoli[k].setCodice(k + 1);
                }
                articoli[nArticoli] = null; //fix perchè altrimenti stampa l'ultimo elemento tot volte richiesto
            }else{
                System.out.println("Articolo non trovato");
            }
        }catch(Exception e){
            System.out.println("Errore, articolo non trovato");
        }
    }

    public double vendiArticolo(String nome){
        int i = 0;
        double prezzo = 0;
        boolean trovato = false;
        try{
            while(i<nArticoli){
                if(articoli[i].getNome().equals(nome)){
                    trovato = true;
                    break;
                }
                i++;
            }
            if(trovato){
                if(articoli[i].getPeso() < PESO_RIFERIMENTO){
                    articoli[i].toString();
                    prezzo = articoli[i].getPrezzo() + PESO_MINORE_10KG;
                }else{
                    articoli[i].toString();
                    prezzo = articoli[i].getPrezzo() + PESO_MAGGIORE_10KG;
                }
                rimuoviArticolo(nome);
                return prezzo;
            }else{
                System.out.println("Articolo non trovato");
                return 0;
            }
        }catch(Exception e){
            System.out.println("Articolo non trovato");
            return 0;
        }
    }

    public Articolo stampaArticoloNome(String nome){
        int i = 0;
        boolean trovato = false;
        try{
            while(i < nArticoli){
                if(articoli[i].getNome().equals(nome)){
                    trovato = true;
                    break;
                }
                i++;
            }
            if(trovato){
                return articoli[i];
            }else{
                System.out.println("Articolo non trovato");
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }
    //stampa tutti gli articoli
    public void stampaArticoli(){
        for(int i = 0; i < nArticoli; i++){
            System.out.println(articoli[i].toString());
        }
    }

    //salva in un file .bin
    public void salvaArticoli(String nomeFile){
        try{
            FileOutputStream fos = new FileOutputStream(nomeFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i = 0; i < nArticoli; i++){
                oos.writeObject(articoli[i].toString());
            }
            oos.close();
            fos.close();
        }catch(Exception e){
            System.out.println("Errore"); 
        }
    }

    //carica da un file .bin
    public void caricaArticoli(String nomeFile){
        try{
            FileInputStream fis = new FileInputStream(nomeFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            for(int i = 0; i < nArticoli; i++){
                System.out.println(ois.readObject());
            }
            ois.close();
            fis.close();
        }catch(Exception e){
            System.out.println("Errore");
        }
    }
}