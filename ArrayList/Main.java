package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductList listaProdotti = new ProductList();
        Product prodotto1 = new Product("Zasta", 2);
        Product prodotto2 = new Product("Sasta", 2);
        listaProdotti.addProduct(prodotto1);
        listaProdotti.addProduct(prodotto2);
        int scelta = 0;
        do{
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Rimuovi prodotto");
            System.out.println("3. Ordina prodotti");
            System.out.println("4. Stampa prodotti");
            System.out.println("0. Esci");
            scelta = input.nextInt();
            switch(scelta){
                case 1:
                    break;
                case 2:
                    System.out.println("Inserisci nome prodotto da rimuovere");
                    String nomeRim = input.next();
                    listaProdotti.removeProduct(nomeRim);
                    break;
                case 3:
                    listaProdotti.compareProduct(prodotto1, prodotto2);
                    break;
                case 4:
                    listaProdotti.printProduct();
                    break;
                case 0:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }while(scelta != 0);
    }
}