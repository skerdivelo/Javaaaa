package HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DizionarioHashMap dizionario = new DizionarioHashMap();
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;
        while (continua) {
            System.out.println("Seleziona un'operazione:");
            System.out.println("1. Aggiungi parola");
            System.out.println("2. Cerca parola");
            System.out.println("3. Elimina parola");
            System.out.println("4. Visualizza dizionario");
            System.out.println("0. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline dopo il numero

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci la parola da aggiungere:");
                    String parola = scanner.nextLine();
                    System.out.println("Inserisci il contrario di " + parola + ":");
                    String contrario = scanner.nextLine();
                    dizionario.aggiungiParola(parola, contrario);
                    System.out.println("Parola aggiunta correttamente.");
                    break;
                case 2:
                    System.out.println("Inserisci la parola da cercare:");
                    parola = scanner.nextLine();
                    dizionario.cercaParola(parola);
                    break;
                case 3:
                    System.out.println("Inserisci la parola da eliminare:");
                    parola = scanner.nextLine();
                    dizionario.eliminaParola(parola);
                    break;
                case 4:
                    dizionario.visualizzaDizionario();
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        scanner.close();
        System.out.println("Programma terminato.");
    }
}
