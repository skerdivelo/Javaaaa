package Cinema;

import java.util.Scanner;

import Students.Studente;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cinema c = new Cinema();
        int scelta = 0;
        do {
            System.out.println("1. Inserisci persona");
            System.out.println("2. Rimuovi persona");
            System.out.println("3. Stampa persone");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Cognome: ");
                    String cognome = input.next();
                    System.out.print("Anno di nascita: ");
                    int nascita = input.nextInt();
                    System.out.print("Sesso: ");
                    char sesso = input.next().charAt(0);
                    Studente p = new Studente(nome, cognome, nascita, sesso);
                    c.enqueue(p);
                    break;
                case 2:
                    Studente p1 = c.dequeue();
                    if (p1 == null) {
                        System.out.println("Coda vuota");
                    } else {
                        System.out.println("Persona rimossa: " + p1);
                    }
                    break;
                case 3:
                    c.stampa();
                    break;
                case 0:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 0);
        input.close();
    }
}
