package Cartella.Coraglia;

import java.util.Scanner;

public class Main {
    //pag 108
    public static void main(String []args) throws ArithmeticException {
        Scanner s = new Scanner(System.in);
        GestioneOrari g = new GestioneOrari(20,10,30);
        int h1 = 0;
        int m1 = 0;
        int s1 = 0;
        int h2 = 0;
        int m2 = 0;
        int s2 = 0;
        System.out.println("Inserisci l'ora del 1°: ");
        h1 = s.nextInt();
        System.out.println("Inserisci i minuti del 1°: ");
        m1 = s.nextInt();
        System.out.println("Inserisci i secondi del 1°: ");
        s1 = s.nextInt();
        System.out.println("Inserisci l'ora del 2°: ");
        h2 = s.nextInt();
        System.out.println("Inserisci i minuti del 2°: ");
        m2 = s.nextInt();
        System.out.println("Inserisci i secondi del 2°: ");
        s2 = s.nextInt();
        try{
            int diff = g.differenzaOrari(h1, m1, s1, h2, m2, s2);
            System.out.println("La differenza tra i due orari è: "+diff);
        }catch(GestioneOrari e){
            System.out.println("Orario sbagliato");
        }
        
    }
}
