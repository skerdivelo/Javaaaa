package Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestioneComputer gestioneComputer = new GestioneComputer();
        Computer computer1 = new Computer(1, "Dell", "Inspiron", 2, 4, 500, 15, 2018);

        Scanner scanner = new Scanner(System.in);
        int scelta= 0;
        int codice = 0;
        do {
            System.out.println("1. Aggiungi computer");
            System.out.println("2. Cerca computer");
            System.out.println("3. Ricerca computer migliore");
            System.out.println("4. Elimina computer");
            System.out.println("5. Salva");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    gestioneComputer.aggiungiComputer(computer1);
                    break;
                case 2:
                    System.out.print("Inserisci codice: ");
                    codice = scanner.nextInt();
                    computer1 = gestioneComputer.cercaComputer(codice);
                    if (computer1 != null) {
                        System.out.println("------------------------------------------------------");
                        System.out.println("Codice: " + computer1.getCodice());
                        System.out.println("Marca: " + computer1.getMarca());
                        System.out.println("Modello: " + computer1.getModello());
                        System.out.println("Processore: " + computer1.getProcessore());
                        System.out.println("RAM: " + computer1.getRam());
                        System.out.println("HDD: " + computer1.getHdd());
                        System.out.println("Dimensioni schermo: " + computer1.getDimensioniSchermo());
                        System.out.println("Anno di acquisto: " + computer1.getAnnoDiAcquisto());
                        System.out.println("------------------------------------------------------");
                    } else {
                        System.out.println("Computer non trovato");
                    }
                    break;
                case 3:
                    Computer computerMigliore = gestioneComputer.ricercaComputerMigliore();
                    if (computerMigliore != null) {
                        System.out.println("Codice: " + computerMigliore.getCodice());
                        System.out.println("Marca: " + computerMigliore.getMarca());
                        System.out.println("Modello: " + computerMigliore.getModello());
                        System.out.println("Processore: " + computerMigliore.getProcessore());
                        System.out.println("RAM: " + computerMigliore.getRam());
                        System.out.println("HDD: " + computerMigliore.getHdd());
                        System.out.println("Dimensioni schermo: " + computerMigliore.getDimensioniSchermo());
                        System.out.println("Anno di acquisto: " + computerMigliore.getAnnoDiAcquisto());
                    } else {
                        System.out.println("Computer non trovato");
                    }
                    break;
                case 4:
                    System.out.print("Inserisci codice: ");
                    int codiceElimina = scanner.nextInt();
                    Computer computerElimina = gestioneComputer.eliminaComputer(codiceElimina);
                    if (computerElimina != null) {
                        System.out.println("Codice: " + computerElimina.getCodice());
                        System.out.println("Marca: " + computerElimina.getMarca());
                        System.out.println("Modello: " + computerElimina.getModello());
                        System.out.println("Processore: " + computerElimina.getProcessore());
                        System.out.println("RAM: " + computerElimina.getRam());
                        System.out.println("HDD: " + computerElimina.getHdd());
                        System.out.println("Dimensioni schermo: " + computerElimina.getDimensioniSchermo());
                        System.out.println("Anno di acquisto: " + computerElimina.getAnnoDiAcquisto());
                    } else {
                        System.out.println("Computer non trovato");
                    }
                    break;
                case 5:
                    gestioneComputer.salva();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
                }
            } while (scelta!=99);

    }
}
