import java.io.*;

public class Magazzino {
    private Articolo[] articoli;
    private static int MAX_ELEMENTI = 100; //numero massimo di elementi che sarà anche la dimensione del vettore
    private int numeroElementi; //conta il numero di elementi nel vettore
    private int contaID = 1; //conta id che poi cambia il numero direttamente 
    private static int PESO_MAGGIORE_10KG = 10;
    private static int PESO_MINORE_10KG = 5;
    private static int PESO_RIFERIMENTO = 10;
    
    public Magazzino(){
        this.articoli = new Articolo[MAX_ELEMENTI];
        this.numeroElementi = 0;
    }

    public void aggiungiArticolo(Articolo a){
        if(numeroElementi<MAX_ELEMENTI){ //verifico che numero di elementi non abbia superato la dimensione
            articoli[numeroElementi] = a;   //aggiungo il mio oggetto nel vettore e incrementando il contatore sono sicuro di non sovrascrivere dati inseriti
            articoli[numeroElementi].setCodice(contaID); //cambio l'id del articolo
            numeroElementi++;
            contaID++;
        }
    }

    public boolean isEmpty(){
        return numeroElementi==0;
    }

    public void rimuoviArticolo(String nome){
        int i = 0;
        boolean trovato = false;
        try{
            while(i<numeroElementi){
                if(articoli[i].getNome().equalsIgnoreCase(nome)){
                    trovato = true;
                    break;
                }
                i++;
            }
            if(trovato){
                for(int j = i; j < numeroElementi -1; j++){
                    articoli[j] = articoli[j + 1]; //quando trovo l'elemento sposto tutto a sinistra;
                }
                numeroElementi--;
                for(int k = 0; k < numeroElementi; k++){
                    System.out.println("Il codice è: "+articoli[k].getCodice());
                    articoli[k].setCodice(k + 1);
                    System.out.println("Il codice nuovo è: "+articoli[k].getCodice());
                }
                articoli[numeroElementi] = null; //cosi non mi stampa tot volte l'ultimo elemento;
            }else{
                System.out.println("Articolo non trovato!");
            }
        }catch (Exception e){
            System.out.println("Errore1");
        }
    }

    public double vendiArticolo(String nome){
        int i = 0;
        boolean trovato = false;
        double prezzo = 0;
        try{
            while(i<numeroElementi){
                if(articoli[i].getNome().equalsIgnoreCase(nome)){
                    trovato = true;
                    break;
                }
                i++;
            }
            if(trovato){
                if(articoli[i].getPeso()<PESO_RIFERIMENTO){
                    prezzo = articoli[i].getPeso() + PESO_MINORE_10KG;
                }else{
                    prezzo = articoli[i].getPeso() + PESO_MAGGIORE_10KG;
                }
                rimuoviArticolo(nome);
                System.out.println("Il prezzo del articolo "+nome+" è: "+prezzo + " euro");
                return prezzo;
            }else{
                System.out.println("Articolo non trovato: ");
                return 0;
            }
        }catch (Exception e){
            System.out.println("Errore2");
            return 0;
        }
    }

    public String stampaArticoloNome(String nome){
        int i = 0;
        boolean trovato = false;
        try{
            while(i<numeroElementi){
                if(articoli[i].getNome().equalsIgnoreCase(nome)){
                    trovato = true;
                    break;
                }
                i++;
            }
            if(trovato){
                return articoli[i].toString();
            }else{
                return "Articolo non trovato!";
            }
        }catch (Exception e){
            return "Errore3";
        }
    }

    public void stampaMagazzino(){
        try{
            if(isEmpty()){
                System.out.println("Errore, magazzino vuoto");
            }else{
                for(int i = 0; i < numeroElementi; i++){
                    System.out.println(articoli[i].toString()+"----------------------");
                }
            }
        }catch (Exception e){
            System.out.println("Errore4");
        }
    }

    public void scriviFile(String nomeFile){
        try{
            if(isEmpty()){
                System.out.println("Magazzino vuoto");
            }else{
                FileOutputStream fos = new FileOutputStream(nomeFile);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(int i = 0; i < numeroElementi; i++){
                    oos.writeObject(articoli[i].toString());
                }
                oos.close();
                fos.close();
            }
        }catch (Exception e){
            System.out.println("Errore5");
        }
    }

    public void caricaFile(String nomeFile){
        try{
            FileInputStream fis = new FileInputStream(nomeFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            for(int i = 0; i < numeroElementi; i++){
                System.out.println(ois.readObject());
            }
            ois.close();
            fis.close();
        }catch(Exception e){
            System.out.println("Errore");
        }
    }
}
