package PortoTuristico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "Ciao";
        String k = "Ciao";
        System.out.println(s.toString());
        System.out.println(k.toString());
        if(s==k){
            System.out.println("Dio");
        }else{
            System.out.println("no");
        }
        /*
        PortoTuristico porto = new PortoTuristico();
        Scanner sc = new Scanner(System.in);
        int scelta = 0;
        do{
            System.out.println("1. Assegna posto");
            System.out.println("2. Libera posto");
            System.out.println("3. Trova barca");
            System.out.println("4. Esci");
            scelta = sc.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il nome della barca");
                    String nome = sc.next();
                    System.out.println("Inserisci la tipologia della barca");
                    String tipologia = sc.next();
                    System.out.println("Inserisci la lunghezza della barca");
                    int lunghezza = sc.nextInt();
                    System.out.println("Inserisci la stazza della barca");
                    int stazza = sc.nextInt();
                    Barca barca = new Barca(nome, lunghezza, stazza, tipologia);
                    System.out.println("Inserisci il numero del posto");
                    int numeroPosto = sc.nextInt();
                    porto.assegnaPosto(numeroPosto, barca);
                    break;
                case 2:
                    System.out.println("Inserisci il numero del posto");
                    numeroPosto = sc.nextInt();
                    System.out.println("Inserisci il numero di giorni");
                    int numeroGiorni = sc.nextInt();
                    porto.liberaPosto(numeroPosto, numeroGiorni);
                    break;
                case 3:
                    System.out.println("Inserisci il numero del posto");
                    numeroPosto = sc.nextInt();
                    Barca barcaTrovata = porto.trovaBarca(numeroPosto);
                    if (barcaTrovata != null) {
                        System.out.println("La barca " + barcaTrovata.getNome() + " è presente nel posto " + numeroPosto);
                    }
                    break;
                case 4:
                    System.out.println("Arrivederci");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }while(scelta != 4);
         */
    }    
}
