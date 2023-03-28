package TODOLIST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creo arraylist di tipo Attività
        TodoList lista = new TodoList();
        int scelta = 0;
        //faccio do-while 99=esci
        do{
            System.out.println("1. Aggiungi attività");
            System.out.println("2. Rimuovi attività");
            System.out.println("3. Modifica priorità");
            System.out.println("4. Stampa lista");
            System.out.println("99. Esci");
            scelta = input.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("Inserisci attività");
                    String attività = input.next();
                    System.out.println("Inserisci priorità");
                    int priorità = Integer.parseInt(input.next());
                    Attivita attivita = new Attivita(attività, priorità);
                    lista.addAttivita(attivita);
                    break;
                case 2:
                    System.out.println("Inserisci indice");
                    int indice = Integer.parseInt(input.next());
                    lista.removeAttivita(indice);
                    break;
                case 3:
                    System.out.println("Inserisci indice");
                    int indice2 = Integer.parseInt(input.next());
                    System.out.println("Inserisci priorità");
                    int priorità2 = Integer.parseInt(input.next());
                    lista.modificaPriorita(indice2, priorità2);
                    break;
                case 4:
                    lista.printTodoList();
                    break;
                case 99:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }while(scelta != 99); input.close();
    }
}
