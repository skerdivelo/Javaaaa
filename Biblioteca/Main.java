import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro(" ", " ", 0, "");
        Biblioteca biblioteca = new Biblioteca();
        String titolo = "", autore= "", editore=" ";
        int scelta = 0, annoDiPubblicazione=0;
        do{
            System.out.println("1. Carica vettore");
            System.out.println("2. Aggiungi libro");
            System.out.println("3. Cerca libro");
            System.out.println("4. Cerca libri di un autore");
            System.out.println("5. Conta libri");
            System.out.println("6. Salva file");
            System.out.println("99. Esci");
            System.out.print("Scelta: ");
            try{
                scelta = sc.nextInt();
                sc.nextLine();
            }catch(Exception e){
                System.out.println("Errore, inserisci un numero intero");
                sc.nextLine();
            }
            switch(scelta){
                case 1:
                    biblioteca.caricaVettore(titolo, autore, annoDiPubblicazione, editore);
                    break;
                case 2:
                    biblioteca.aggiungiLibro(libro);
                    break;
                case 3:
                    biblioteca.cercaLibro(titolo);
                    break;
                case 4:
                    biblioteca.cercaLibriAutore(autore);
                    break;
                case 5:
                    biblioteca.contaLibri();
                    break;
                case 6:
                    try {
                        biblioteca.salvaFile();
                    } catch (IOException e) {
                        System.out.println("Errore");
                    }
                    break;
                case 99:
                    System.out.println("Arrivederci!");
                    break;
            }
        }while(scelta != 99);
    }
}