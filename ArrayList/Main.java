package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Mario");
        nomi.add("Luigi");
        nomi.add("Pippo");
        nomi.add("Pluto");
        Iterator<String> it = nomi.iterator();
        while(it.hasNext()){
            String nome = it.next();
            if(nome.equals("Pippo")){
                it.remove();
            }
        }
        for(String nome : nomi){
            System.out.println(nome);
        }
        //ProductList listaProdotti = new ProductList();
        //faccio switch case per scegliere cosa fare
        /*
        int scelta = 0;
        do{
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Rimuovi prodotto");
            System.out.println("3. Stampa lista prodotti");
            System.out.println("99. Esci");
            scelta = input.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci nome prodotto");
                    String nome = input.next();
                    System.out.println("Inserisci prezzo prodotto");
                    int prezzo = Integer.parseInt(input.next());
                    Product prodotto = new Product(nome, prezzo);
                    listaProdotti.addProduct(prodotto);
                    break;
                case 2:
                    System.out.println("Inserisci nome prodotto da rimuovere");
                    String nomeProdotto = input.next();
                    listaProdotti.removeProduct(nomeProdotto);
                    break;
                case 3:
                    listaProdotti.printProductList();
                    break;
                case 4:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }while(scelta != 99);
        input.close();
    */
    }
}