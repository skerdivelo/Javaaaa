import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magazzino m = new Magazzino();
        Articolo a = new Articolo(" ", 0, 0);
        int scelta = 0;
        String nome;
        double peso, prezzo;
        do{
            try{
                System.out.println("1. Aggiungi articolo");
                System.out.println("2. Rimuovi articolo");
                System.out.println("3. Vendere articolo");
                System.out.println("4. Stampa articolo");
                System.out.println("5. Stampa magazzino");
                System.out.println("6. Salva magazzino");
                System.out.println("7. Carica magazzino");
                System.out.println("99. Esci");
                scelta = Integer.parseInt(sc.nextLine());
                switch(scelta){
                    case 1:
                        System.out.println("Inserisci nome");
                        nome = sc.nextLine();
                        System.out.println("Inserisci peso");
                        peso = Double.parseDouble(sc.nextLine());
                        System.out.println("Inserisci prezzo");
                        prezzo = Double.parseDouble(sc.nextLine());
                        a = new Articolo(nome, peso, prezzo);
                        m.aggiungiArticolo(a);
                        break;
                    case 2:
                        if(m.isEmpty()){
                            System.out.println("Il magazzino è vuoto! Aggiungi articoli! ");
                            break;
                        }else{
                            System.out.println("Inserisci nome articolo da rimuovere");
                            nome = sc.nextLine();
                            m.rimuoviArticolo(nome);
                            break;
                        }
                    case 3:
                        if(m.isEmpty()){
                            System.out.println("Il magazzino è vuoto! Aggiungi articoli! ");
                            break;
                        }else{
                            System.out.println("Inserisci nome articolo da vendere");
                            nome = sc.nextLine();
                            System.out.println("Il prezzo è: " + m.vendiArticolo(nome));
                            break;
                        }
                    case 4:
                        if(m.isEmpty()){
                            System.out.println("Il magazzino è vuoto! Aggiungi articoli! ");
                            break;
                        }else{
                            System.out.println("Inserisci nome articolo da stampare");
                            nome = sc.nextLine();
                            if(m.stampaArticoloNome(nome) == null){
                                System.out.println("Articolo non trovato");
                                break;
                           }else{
                                System.out.println(m.stampaArticoloNome(nome));
                                break;
                            }
                        }
                    case 5:
                        if(m.isEmpty()){
                            System.out.println("Il magazzino è vuoto! Aggiungi articoli! ");
                            break;
                        }
                            m.stampaArticoli();
                            break;
                    case 6:
                        if(m.isEmpty()){
                            System.out.println("Il magazzino è vuoto! Aggiungi articoli! ");
                            break;
                        }else{
                            m.salvaArticoli("giacenza.bin");
                            break;
                        }
                    case 7:
                        m.caricaArticoli("giacenza.bin");
                        break;
                    case 99:
                        System.out.println("Arrivederci");
                        break;
                    default:
                        System.out.println("Scelta non valida");
                        break;
                }
            }catch(Exception e){
                System.out.println("Errore");
            }
        }while(scelta != 99);
        sc.close();
    }
}