package Verifica_Velo28_02; //commentare in caso si usi vsc o in locale

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magazzino m = new Magazzino(); // creo un magazzino
        Articolo a = new Articolo(" ", 0., 0); //creo un articolo che mi serve per l'aggiunta
        int scelta = 0;
        String nome = " ";
        double peso= 0., prezzo = 0.;
        do{
            try{
                System.out.println("1. Aggiungi articolo");
                System.out.println("2. Rimuovi articolo");
                System.out.println("3. Visualizza informazione articolo");
                System.out.println("4. Vendi articolo");
                System.out.println("5. Visualizza magazzino");
                System.out.println("6. Salva in un file");
                System.out.println("7. Carica da file");
                System.out.println("99. Esci");
                scelta = Integer.parseInt(sc.nextLine());
                switch(scelta){
                    case 1:
                        System.out.println("Inserisci il nome dell'articolo che vuoi aggiungere: ");
                        nome = sc.nextLine(); //input nome
                        System.out.println("Inserisci il peso dell'articolo che vuoi aggiungere: ");
                        peso = Double.parseDouble(sc.nextLine()); //input peso
                        System.out.println("Inserisci il prezzo dell'articolo che vuoi aggiungere: ");
                        prezzo = Double.parseDouble(sc.nextLine()); //input prezzo
                        a.setNome(nome); //setto nome
                        a.setPeso(peso); //setto peso
                        a.setPrezzo(prezzo); //setto prezzo
                        m.aggiungiArticolo(a); //aggiungo
                        break;
                    case 2:
                        System.out.println("Inserisci il nome dell'articolo che vuoi rimuovere: ");
                        nome = sc.nextLine(); //input nome
                        m.rimuoviArticolo(nome); //rimuovo
                        break;
                    case 3:
                        System.out.println("Inserisci il nome dell'articolo di cui vuoi visualizzare le informazioni: ");
                        nome = sc.nextLine(); //input nome
                        System.out.println(m.visualizzaInfo(nome)); //visualizzo
                        break;
                    case 4:
                        System.out.println("Inserisci il nome dell'articolo che vuoi vendere: ");
                        nome = sc.nextLine(); //input nome
                        System.out.println("Il prezzo dell'articolo è: 1"+m.vendiArticolo(nome)); //vendo
                        break;
                    case 5: 
                        m.stampaMagazzino(); //visualizzo
                        break;
                    case 6:
                        m.salvaGiacenza(); //salvo in un file
                        break;
                    case 7:
                        m.caricaGiacenza(); //carico da un file
                        break;
                    case 99:
                        System.out.println("Arrivederci ");
                        break;
                    default:
                        System.out.println("Scelta non valida: ");
                        break;
                }
            }catch (Exception e){
                System.out.println("Errore");
            }
        }while(scelta != 99);
        sc.close();
    }
}