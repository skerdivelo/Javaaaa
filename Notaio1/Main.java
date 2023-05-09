package Notaio1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AcquirenteLista acquirenti = new AcquirenteLista();
        Scanner sc = new Scanner(System.in);
        int scelta = 0;
        String nome, cognome, email, telefono, chiVende;
        double renditaCatastale, prezzo, caparra;
        boolean acquistoConMutuo;

        do{
            System.out.println("1. Aggiungi acquirente");
            System.out.println("2. Rimuovi acquirente");
            System.out.println("3. Stampa acquirenti");
            System.out.println("4. Ordina per cognome");
            System.out.println("99. Esci");
            scelta = sc.nextInt();

            
        }while(scelta != 99);
    }
}
