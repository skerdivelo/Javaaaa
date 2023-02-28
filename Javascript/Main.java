import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magazzino m = new Magazzino();
        Articolo a = new Articolo(" ", 0.0, 0.0);
        String nome = " ";
        double peso=0. ,prezzo=0.;
        int scelta = 0;
        do{
            try{
                System.out.println("1. Aggiungi articolo");
                System.out.println("2. Rimuovi articolo");
                System.out.println("3. Vendi articolo");
                System.out.println("4. Cerca articolo per nome");
                System.out.println("5. Stampa magazzino");
                System.out.println("6. Salva magazzino in un file");
                System.out.println("7. Carica da file");
                System.out.println("99. Esci");
                scelta = Integer.parseInt(sc.nextLine());
                switch(scelta){
                    case 1:
                        System.out.println("Inserisci il nome");
                        nome = sc.nextLine();
                        System.out.println("Inserisci il peso");
                        peso = Double.parseDouble(sc.nextLine());
                        System.out.println("Inserisci il prezzo");
                        prezzo = Double.parseDouble(sc.nextLine());
                        a = new Articolo(nome, peso, prezzo);
                        m.aggiungiArticolo(a);
                        break;
                    case 2:
                        if(m.isEmpty()){
                            System.out.println("Errore magazzino vuoto, aggiungi un articolo!");
                            break;
                        }else{
                            System.out.println("Inserisci il nome del articolo che vuoi eliminare: ");
                            nome = sc.nextLine();
                            m.rimuoviArticolo(nome);
                        }
                        break;
                    case 3:
                        if(m.isEmpty()){
                            System.out.println("Errore magazzino vuoto, aggiungi un articolo!");
                            break;
                        }else{
                            System.out.println("Inserisci il nome del articolo che vuoi vendere: ");
                            nome = sc.nextLine();
                            m.vendiArticolo(nome);
                        }
                        break;
                    case 4:
                        if(m.isEmpty()){
                            System.out.println("Errore magazzino vuoto, aggiungi un articolo!");
                            break;
                        }else{
                            System.out.println("Inserisci il nome del articolo che vuoi stampare: ");
                            nome = sc.nextLine();
                            System.out.println(m.stampaArticoloNome(nome));
                        }
                        break;
                    case 5:
                        m.stampaMagazzino();
                        break;
                    case 6:
                        m.scriviFile("giacenza.bin");
                        break;
                    case 7:
                        m.caricaFile("giacenza.bin");
                        break;
                    case 99:
                        System.out.println("Arrivederci");
                        break;
                    default:
                        System.out.println("Scelta non valida");
                }
            }catch (Exception e){
                System.out.println("Errore quss");
            }
        }while(scelta!=99);
        sc.close();
    }
}
